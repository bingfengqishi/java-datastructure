package cn.com.datastructure.map;

/**
 * Created by lenovo on 2018/1/17.
 */
public interface Map<K,V> {
    V get(K k);
    V put (K k,V v);
    int size();
    interface Entry<K,V> {
        K getKey();
        V getValue ();
    }
}
