package chapter16;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class GenericMyMapImpl<K, V> implements GenericMyMap<K, V> {

    private K key;
    private V value;

    public GenericMyMapImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey()    { return key; }
    public V getValue() { return value; }
}
