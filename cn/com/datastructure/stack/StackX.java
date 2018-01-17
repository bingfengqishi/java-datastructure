package cn.com.datastructure.stack;

/**
 * Created by lenovo on 2017/12/25.
 * javaz栈
 */
public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public  StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j){
        stackArray[++top] = j;
    }

    public char pop(){
        return  stackArray[top--];
    }

    public  char peek(){
        return  stackArray[top];
    }

    public  boolean isEmpty(){
        return top ==-1;
    }

}
