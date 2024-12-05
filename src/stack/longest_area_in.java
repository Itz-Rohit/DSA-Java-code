package stack;

public class longest_area_in {
    int getmaxarea(int arr[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i])
                    curr = curr + arr[i];
                else
                    break;
            }
            for (int j = j = 1; j < n; j++) {
                if (arr[j] >= arr[i])
                    curr = curr + arr[i];
                else
                    break;
            }
            res = Math.max(res, curr);


        }
        return res;

    }


    public static void main(String[] args) {
        longest_area_in obj = new longest_area_in();
        int[] arr = {5,6,7,8,10,45,67};
        int n = arr.length;
        int result = obj.getmaxarea(arr ,n);
        System.out.println(" Maximum Area is " +result);

    }
}