package structure.map;

public class LinkedHashMap {

    static class Entry<K, V> extends HashMap.Node<K, V> {
        Entry<K,V> before, after;
        public Entry(int hash, K key, V value, HashMap.Node<K, V> next) {
            super(hash, key, value, next);
        }
    }

}
