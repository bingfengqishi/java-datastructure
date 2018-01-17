package cn.com.datastructure.list;

/**
 * Created by lenovo on 2017/12/26.
 */
public class LinkList {
    private Link first;

    public LinkList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertFirst(int iData,double dData){
        Link link = new Link(iData,dData);
        link.next = first;
        first = link;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return  temp;
    }

    public void displayList(){
        Link current = first;
        while (current!=null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
