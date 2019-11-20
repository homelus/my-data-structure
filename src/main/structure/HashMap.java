package structure;

import java.io.Serializable;
import java.util.Set;

/**
 * @author playjun
 * @since 2019 11 20
 */
public class HashMap<K,V> extends AbstractMap<K,V>
    implements Map<K,V>, Cloneable, Serializable {
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
