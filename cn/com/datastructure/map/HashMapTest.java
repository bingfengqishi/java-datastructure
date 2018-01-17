package cn.com.datastructure.map;

/**
 * Created by lenovo on 2018/1/17.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        map.put("libo",31);
        System.out.println(map.get("libo"));
    }
}
