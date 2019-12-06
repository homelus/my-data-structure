package structure.map;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface ConcurrentMap<K,V> extends Map<K,V> {

    @Override
    default V getOrDefault(Object key, V defaultValue) {
        V v;
        return ((v = get(key)) != null) ? v : defaultValue;
    }

    @Override
    default void forEach(BiConsumer<? super K, ? super V> action) {
        Objects.requireNonNull(action);
        for (Entry<K,V> entry : entrySet()) {
            K k;
            V v;
            try {
                k = entry.getKey();
                v = entry.getValue();
            } catch (IllegalStateException ise) {
                continue;
            }
            action.accept(k, v);
        }
    }

    V putIfAbsent(K key, V value);

    boolean remove(Object key, Object value);

    boolean replace(K key, V oldValue, V newValue);

    @Override
    default void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
        Objects.requireNonNull(function);
        forEach((k,v) -> {
            while (!replace(k, v, function.apply(k, v))) {
                if ((v = get(k)) == null) {
                    break;
                }
            }
        });
    }

    @Override
    default V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        V oldValue, newValue;
        return ((oldValue = get(key)) == null
                && (newValue = mappingFunction.apply(key)) != null
                && (oldValue = putIfAbsent(key, newValue)) == null)
                ? newValue
                : oldValue;
    }
}
