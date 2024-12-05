package Recursion;


class plain{
    boolean ispalindrome(String str,int start , int end){
        if (start>=end){
            return true;
        }

        return (str.charAt(start) == str.charAt(end)) && ispalindrome(str,start+1,end-1);
    }
}

public class pallindrome {
    public static void main(String[] args) {
        plain obj = new plain();
        boolean result = obj.ispalindrome("abceettrtrtrba",0,"abceettrtrtrba".length()-1);
        System.out.println("The output is :"+result);
    }
}
