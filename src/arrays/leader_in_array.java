package arrays;

import java.util.Arrays;

class leamder{
    public void leader(int arr[]){
        for (int i=0;i< arr.length;i++){
            boolean flag = false;
            for (int j=i+1;j< arr.length;j++){
                if (arr[i] <= arr[j]){
                    flag =true;
                    break;
                }
            }
            if (flag == false){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}

public class leader_in_array {
    public static void main(String[] args) {
        leamder obj =new leamder();
        int[] arr = {1,2,35,4,8,2,3,5,6,8,9,9,99,999,9,99,9,9,9,9,99,};
        System.out.println("original array: "+ Arrays.toString(arr));
        obj.leader(arr);




    }
}
