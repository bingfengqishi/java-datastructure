package cn.com.datastructure.classloader;

/**
 * Created by lenovo on 2018/1/17.
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader loader = new MyClassLoader("libo","D:/tmp/");
        MyClassLoader classLoader = new MyClassLoader(loader,"tangtang","D:/tmp/");
        Class<?> clv = classLoader.loadClass("cn.com.datastructure.classloader.Demo");
        clv.newInstance();
    }
}
