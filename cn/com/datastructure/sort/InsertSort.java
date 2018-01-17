package cn.com.datastructure.sort;

/**
 * Created by lenovo on 2017/12/22.
 * 插入排序
 */
public class InsertSort {
    private long [] a;
    private int eElems;
    public InsertSort(int max){
        a = new  long[max];
        eElems = 0;
    }
    public void  insert(long value){
        a[eElems] = value;
        eElems ++;
    }
    private  void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public  void insertSort(){
        int in = 0;
        long temp =0;
        for (int i = 1; i <eElems ; i++) {
             temp = a[i];
             in = i;
             while ( in > 0 && a[in-1]>=temp){
                a[in] = a[in -1];
                --in;
             }
             a[in] = temp;
        }
    }

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort(5);
        long startTime = System.currentTimeMillis();
        insertSort.insert(123);
        insertSort.insert(45);
        insertSort.insert(12);
        insertSort.insert(789);
        insertSort.insert(4);
        insertSort.insertSort();
        long endTime = System.currentTimeMillis();
        System.out.println("insertSort time="+String.valueOf(endTime-startTime));
        insertSort.display();
    }
}
