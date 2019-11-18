package structure;

public class HashMap implements Map {

    private final int DEFAULT_SIZE = 31;
    private Object[] data = new Object[DEFAULT_SIZE];
    private int size;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public Object get(Object key) {
        return null;
    }

    public Object put(Object key, Object value) {
        return null;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        int hash = o.hashCode();
        int location = hash % data.length;

        if (data[location] == null) {
            List<Object> entries = new ArrayList<Object>();
            entries.add(o);
            data[location] = entries;
            size++;
            return true;
        } else {
            List<Object> entries = (List<Object>) data[location];
            if (!entries.contains(o)) {
                entries.add(o);
                size++;
                return true;
            }
        }

        return false;
    }

    public void putAll(Map m) {

    }

    public boolean addAll(Collection c) {
        return false;
    }

    public void clear() {

    }

    public Set keySet() {
        return null;
    }

    public Collection values() {
        return null;
    }

    public Set<Entry> entrySet() {
        return null;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


}
