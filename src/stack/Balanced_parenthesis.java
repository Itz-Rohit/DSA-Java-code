package stack;

import java.util.Stack;

public class Balanced_parenthesis {

    boolean isBalanced(String str){
        Stack <Character>s = new Stack <>();

        for (int i=0;i<str.length();i++) {
            char current =str.charAt(i);


            if (current =='(' || current=='{' || current=='[')
                s.push(current);
            else{
                if (s.empty()==true)
                    return false;
                else if (matching(s.peek(),current)==false) {
                    return false;
                    
                }
                else{
                    s.pop();
                }
            }




        }
        return s.isEmpty();


        }
    boolean matching(char a,char b){
        return((a == '(' && b == ')') ||
                (a == '{' && b == '}') ||
                (a == '[' && b == ']'));

    }

    public static void main(String[] args) {
        Balanced_parenthesis bp = new Balanced_parenthesis();

        String test1 = "(){}[]";
        String test2 = "({[]})";
        String test3 = "({[})";
        String test4 = "({[}";
        String test5 = "";

        System.out.println(test1 + ": " + bp.isBalanced(test1));
        System.out.println(test2 + ": " + bp.isBalanced(test2));
        System.out.println(test3 + ": " + bp.isBalanced(test3));
        System.out.println(test4 + ": " + bp.isBalanced(test4));
        System.out.println(test5 + ": " + bp.isBalanced(test5));

    }
}