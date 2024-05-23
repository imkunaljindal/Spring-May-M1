import java.io.*;
import java.util.*;

public class InfixConversions {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Solution ob =new Solution();
        ob.evaluate(exp);
    }
}

class Solution{
    public int evaluate(int op1, int op2, char operator) {
        if(operator == '+') return op1 + op2;
        if(operator == '-') return op1 - op2;
        if(operator == '*') return op1 * op2;
        return op1/op2;
    }

    public int priority(char operator) {
        if(operator == '/' || operator == '*') return 1;
        return 0;
    }

    public void evaluate(String exp){
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> sign = new Stack<>();

        for(int i=0;i<exp.length();i++) {
            char c = exp.charAt(i);
            if(c == '(') {
                sign.push(c);
            }
            else if(c >= '0' && c<='9') {
                numbers.push(c - '0');
            }
            else if(c=='+' || c=='-' || c=='/' || c=='*') {
                while(sign.size()> 0 && sign.peek() != '('
                        && priority(sign.peek()) >= priority(c)) {
                    int op2 = numbers.pop();
                    int op1 = numbers.pop();
                    char currOperand = sign.pop();
                    int result = evaluate(op1,op2,currOperand);
                    numbers.push(result);
                }
                sign.push(c);
            }
            else {
                // case for ) brace
                while(sign.size() > 0 &&
                        sign.peek() != '(') {
                    int op2 = numbers.pop();
                    int op1 = numbers.pop();
                    char currOperand = sign.pop();
                    int result = evaluate(op1,op2,currOperand);
                    numbers.push(result);
                }
                sign.pop();
            }
        }

        while(sign.size() > 0) {
            int op2 = numbers.pop();
            int op1 = numbers.pop();
            char operand = sign.pop();
            numbers.push(evaluate(op1,op2,operand));
        }

        System.out.println(numbers.peek());
    }
}               