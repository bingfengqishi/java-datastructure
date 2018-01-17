package cn.com.datastructure.sort;

/**
 * Created by lenovo on 2017/12/22.
 * 选择排序，比较的次数为O(N*N)
 * 交换的次数为O(N)
 * 性能比冒泡好点，因为交换的次数小
 */
public class SelectSort {
    private long [] a;
    private int eElems;
    public SelectSort(int max){
        a = new  long[max];
        eElems = 0;
    }
    public void  insert(long value){
        a[eElems] = value;
        eElems ++;
    }
    public void selectSort(){
        int min = 0;
        for (int i=0;i<eElems-1;i++){
            for (int j=i+1;j<eElems;j++){
                if(a[j] < a[min]){
                    min = j;
                }
                swap(i,min);
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
        SelectSort selectSort = new SelectSort(5);
        long startTime = System.currentTimeMillis();
        selectSort.insert(123);
        selectSort.insert(45);
        selectSort.insert(12);
        selectSort.insert(789);
        selectSort.insert(4);
        selectSort.selectSort();
        long endTime = System.currentTimeMillis();
        System.out.println("selectSort time="+String.valueOf(endTime-startTime));
        selectSort.display();
    }
}
