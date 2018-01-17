package cn.com.datastructure.classloader;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * Created by lenovo on 2018/1/17.
 */
public class MyClassLoader extends ClassLoader {
    private String name;
    private String path;
    public MyClassLoader(String name,String path){
        super(); //系统类加载
        this.name = name;
        this.path = path;
    }
    public MyClassLoader(ClassLoader parent,String name,String path){
        super(parent); //自定义的加载类
        this.name = name;
        this.path = path;
    }
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte [] data = readClassFileToByteArray(name);
        return this.defineClass(name,data,0,data.length);
    }

    private byte[] readClassFileToByteArray(String name) {
        InputStream is = null;
        byte [] resultData = null;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        name = name.replaceAll("\\.","/");
        String filePath = this.path + name+".class";
        File file = new File(filePath);
        try{
            is = new FileInputStream(file);
            int temp = 0;
            while((temp=is.read())!= -1){
                os.write(temp);
            }
            resultData = os.toByteArray();
            os.close();
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  resultData;
    }
}
