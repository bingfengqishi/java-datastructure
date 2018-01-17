package cn.com.datastructure.list;

/**
 * Created by lenovo on 2017/12/26.
 */
public class Link {
    private  int  iData;
    private double dData;
    public Link next;

    public  Link(int iData,double dData){
        this.iData = iData;
        this.dData = dData;
    }
    public void displayLink(){
        System.out.println("{"+iData+","+dData+"}");
    }
}
