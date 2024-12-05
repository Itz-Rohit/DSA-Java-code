package stack;

import java.util.Stack;

public class evaluation_postfix {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> st = new Stack<>();
        for (int i=0; i <expression.length();i++){
            char x = expression.charAt(i);
            if (x == ' ')continue;
            if (Character.isDigit(x)){
                int digit = x - '0';
                st.push(digit);

            }
            else{
                int op1 = st.pop();
                int op2 = st.pop();
                switch (x){
                    case '+':
                        st.push(op1 + op2);
                        break;
                    case '-':
                        st.push(op2 - op1);
                        break;
                    case '*':
                        st.push(op2 * op1);
                        break;
                    case '/':
                        st.push(op2 / op1);
                        break;
                    case '^':
                        st.push((int) Math.pow(op2, op1));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported operator: " + x);

                }
            }



        }
        return st.pop();

    }

    public static void main(String[] args) {
        String expression = "2 3 * 7 +";
        System.out.println(evaluation_postfix.evaluatePostfix(expression));
    }
}


