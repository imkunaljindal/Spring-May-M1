import java.io.*;
import java.util.*;

public class Postfix {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Solution ob =new Solution();
        ob.evaluation(exp);
    }
}

class Solution{

    static int calc(int op1, int op2, char operator) {
        if(operator == '+') return op1 + op2;
        if(operator == '-') return op1 - op2;
        if(operator == '*') return op1 * op2;
        return op1/op2;
    }
    public void evaluation(String exp){
        Stack<Integer> val = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> infix = new Stack<>();
        for(int i=0;i<exp.length();i++) {
            char ch = exp.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int op2 = val.pop();
                int op1 = val.pop();
                int result = calc(op1,op2,ch);
                val.push(result);

                // prefix
                String e2 = prefix.pop();
                String e1 = prefix.pop();
                String ansPrefix = ch + e1 + e2; // +AB
                prefix.push(ansPrefix);

                //infix A+B
                String t2 = infix.pop();
                String t1 = infix.pop();
                String ansInfix = '(' + t1 + ch + t2 + ')'; // +AB
                infix.push(ansInfix);
            }
            else {
                // char is a number
                val.push(ch - '0');
                prefix.push(ch + "");
                infix.push(ch + "");
            }
        }
        System.out.println(val.peek());
        System.out.println(prefix.peek());
        System.out.println(infix.peek());
    }
}                         