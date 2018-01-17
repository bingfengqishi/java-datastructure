package cn.com.datastructure.map;

/**
 * Created by lenovo on 2018/1/17.
 */
public class HashMap<K, V> implements Map<K, V> {

    private static int defaultLength = 16;
    private static double defaultLoader = 0.75;
    private Entry<K, V> [] table = null;
    int size = 0;

    public HashMap() {
        this(defaultLength, defaultLoader);
    }

    public HashMap(int length, double loader) {
        defaultLength = length;
        defaultLoader = loader;
        table = new Entry[defaultLength];
    }

    @Override
    public V get(K k) {
        int index = hash(k);
        Entry<K,V> entry = table[index];
        if(entry == null){
            return null;
        }else{
            return  findEntry(entry,k);
        }
    }

    public V findEntry(Entry<K,V> entry,K k){
        if(k==entry.getKey() || k.equals(entry.getKey())){
            return entry.getValue();
        }else{
            if(entry.next!=null){
                return findEntry(entry.next,k);
            }
        }
        return  null;
    }

    @Override
    public V put(K k, V v) {
        size++;
        int index = hash(k);
        Entry<K,V> entry  = table[index];
        if(entry == null){
            table[index]  = newEntry(k,v,null);
        }else{
            table[index] = newEntry(k,v,entry);
        }
        return  table[index].getValue();
    }

    public Entry<K,V> newEntry(K k,V v,Entry<K,V> next){
        return  new Entry<K, V>(k,v,next);
    }

    @Override
    public int size() {
        return size;
    }

    public int hash(K k) {
        int i = k.hashCode()%defaultLength;
        return i>=0?i:-i;
    }

    class Entry<K, V> implements Map.Entry<K, V> {
        K k;
        V v;
        Entry<K, V> next;

        public Entry(K k, V v, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.next = next;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }
}
