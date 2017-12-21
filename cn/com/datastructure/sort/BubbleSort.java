package cn.com.datastructure.sort;

/**
 * Created by lenovo on 2017/12/21.
 */
public class BubbleSort {
    private long [] a;
    private int eElems;
    public BubbleSort(int max){
        a = new  long[max];
        eElems = 0;
    }
    public void  insert(long value){
        a[eElems] = 0;
        eElems ++;
    }
    public void bubbleSort(){
        for (int i=eElems-1;i>1;i--){
            for (int j=0;j<i;j++){
                if(a[i] > a[i+1]){
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

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(5);
        bubbleSort.insert(123);
        bubbleSort.insert(45);
        bubbleSort.insert(12);
        bubbleSort.insert(789);
        bubbleSort.insert(4);
        bubbleSort.bubbleSort();
    }
}
