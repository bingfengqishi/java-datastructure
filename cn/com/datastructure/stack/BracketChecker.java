package cn.com.datastructure.stack;

/**
 * Created by lenovo on 2017/12/25.
 */
public class BracketChecker {
    private  String input;
    public  BracketChecker(String input){
        this.input = input;
    }
    public void check(){
        int length = input.length();
        StackX stackX = new StackX(length);
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    stackX.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!stackX.isEmpty()){
                        char chx = stackX.pop();
                        if((ch=='{'&& chx!='}')||(ch=='['&& chx!=']')||(ch=='('&& chx!=')')){
                            System.out.println("Error:"+ch+"at"+i);
                        }
                    }else {
                        System.out.println("Error:"+ch+"at"+i);
                    }
                default:
                    break;
            }
        }
    }
}
