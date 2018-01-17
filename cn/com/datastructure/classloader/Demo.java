package cn.com.datastructure.classloader;

/**
 * Created by lenovo on 2018/1/17.
 */
public class Demo {
    public Demo(){
        System.out.println("B  Demo classLoader "+this.getClass().getClassLoader());
    }
}
