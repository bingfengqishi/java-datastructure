package cn.com.datastructure.sort;

/**
 * Created by lenovo on 2017/12/21.
 * 冒泡排序，时间负责度为O(N*N)
 * 效率较差
 */
public class BubbleSort {
    private long [] a;
    private int eElems;
    public BubbleSort(int max){
        a = new  long[max];
        eElems = 0;
    }
    public void  insert(long value){
        a[eElems] = value;
        eElems ++;
    }
    public void bubbleSort(){
        for (int i=eElems-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(a[j] > a[j+1]){
                    swap(j,j+1);
                }
            }
        }
    }
    private void swap(int one,int two ){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    
    private  void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(5);
        long startTime = System.currentTimeMillis();
        bubbleSort.insert(123);
        bubbleSort.insert(45);
        bubbleSort.insert(12);
        bubbleSort.insert(789);
        bubbleSort.insert(4);
        bubbleSort.bubbleSort();
        long endTime = System.currentTimeMillis();
        System.out.println("bubbleSort time="+String.valueOf(endTime-startTime));
        bubbleSort.display();
    }
}
