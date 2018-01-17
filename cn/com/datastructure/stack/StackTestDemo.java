package cn.com.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lenovo on 2017/12/25.
 */
public class StackTestDemo {
    public static void main(String[] args) throws IOException{
        String input;
        while (true){
            System.out.flush();
            input = getString();
            if("".equals(input)){
                break;
            }
            BracketChecker bracketChecker = new BracketChecker(input);
            bracketChecker.check();
        }
    }
    private static String getString()throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        String s = bufferedReader.readLine();
        return  s;
    }
}
