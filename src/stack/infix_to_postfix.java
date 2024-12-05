package stack;

import java.util.Stack;

public class infix_to_postfix {
    public  static  String infixtopostfix(String Expression){
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0 ; i <Expression.length();i++){
            char x = Expression.charAt(i);
            if (Character.isLetterOrDigit(x)){
                res.append(x);
            }
            else if (x=='(') {
                st.push(x);

            }
            else if (x==')') {
                while (!st.isEmpty() && st.peek()!='('){
                     res.append(st.pop());
                }
                st.pop();


            }
            else{
                while (!st.isEmpty() && precedence(x) <= precedence(st.peek())){
                    res.append(st.pop());
                }
                st.push(x);
            }

        }
        while (!st.isEmpty()){
            if (st.peek() == '('){
                throw new IllegalArgumentException("Inavlid");

            }
            res.append(st.pop());
        }
        return res.toString();

    }
    public static int precedence(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case  '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;






        }
    }

    public static void main(String[] args) {
        String Expression = "a+b*c";  
        System.out.println(infix_to_postfix.infixtopostfix(Expression));
    }

}
