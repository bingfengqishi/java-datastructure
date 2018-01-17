package cn.com.datastructure.list;

/**
 * Created by lenovo on 2017/12/26.
 */
public class LinkListDemo {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(1,1.2);
        linkList.insertFirst(2,2.2);
        linkList.insertFirst(3,3.2);
        linkList.insertFirst(4,4.2);
        linkList.displayList();
        while (!linkList.isEmpty()){
            Link link = linkList.deleteFirst();
            System.out.println("Deleted!");
            link.displayLink();
        }
        linkList.displayList();
    }
}
