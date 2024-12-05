package stack;
import java.util.Stack;

public class evalutaion_prefix {
    public static int evaluatePrefix(String expression) {
        Stack<Integer> st = new Stack<>();


        for (int i = expression.length() - 1; i >= 0; i--) {
            char x = expression.charAt(i);


            if (x == ' ') continue;


            if (Character.isDigit(x)) {
                int digit = x - '0';
                st.push(digit);
            } else {

                int op1 = st.pop();
                int op2 = st.pop();

                switch (x) {
                    case '+':
                        st.push(op1 + op2);
                        break;
                    case '-':
                        st.push(op1 - op2);
                        break;
                    case '*':
                        st.push(op1 * op2);
                        break;
                    case '/':
                        st.push(op1 / op2);
                        break;
                    case '^':
                        st.push((int) Math.pow(op1, op2));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported operator: " + x);
                }
            }
        }


        return st.pop();
    }

    public static void main(String[] args) {

        String expression = "+ * 10 2 3";
        System.out.println(evalutaion_prefix.evaluatePrefix(expression));
    }
}
