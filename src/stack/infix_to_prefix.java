package stack;

import java.util.Stack;

public class infix_to_prefix {

    public static String infixToPrefix(String expression) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char x = expression.charAt(i);


            if (x == ' ') continue;


            if (Character.isLetterOrDigit(x)) {
                result.append(x);
            }

            else if (x == ')') { // Treat ')' as '('
                st.push(x);
            }

            else if (x == '(') { // Treat '(' as ')'
                while (!st.isEmpty() && st.peek() != ')') {
                    result.append(st.pop());
                }
                st.pop(); // Pop the right parenthesis
            }

            else {
                while (!st.isEmpty() && precedence(x) < precedence(st.peek())) {
                    result.append(st.pop());
                }
                st.push(x);
            }
        }


        while (!st.isEmpty()) {
            result.append(st.pop());
        }


        return result.reverse().toString();
    }


    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        String infixExpression = "a + b * c";
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
    }
}
