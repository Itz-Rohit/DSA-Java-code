package Recursion;


class subset{
    public void subset_of_string(String str){
        subset_of_string(str," ", 0);
    }
    public static void subset_of_string(String str, String curr, int i){
        if (i==str.length()){
            System.out.println(curr);
            return;
        }
        subset_of_string(str, curr, i+1);
        subset_of_string(str,curr + str.charAt(i),i+1);
    }

}
public class generation_subset {
    public static void main(String[] args) {
        subset obj = new subset();
        String str="ABC";
        obj.subset_of_string(str);
    }
}
