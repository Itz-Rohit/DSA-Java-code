package arrays;


class maximum{
    public int getmaximun(int arr[]){
        int res1 =0;
        for (int i= 1;i< arr.length;i++){
            if (arr[i]>arr[res1]){
                res1 =i;
            }
        }
        return res1;
    }
    public int secondlargest(int arr[]){
        int largest = getmaximun(arr);
        int res= -1;
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=arr[largest]) {
                if (res == -1) {
                    res = i;
                } else if (arr[i] > arr[res]) {
                    res = i;

                }
            }
        }
        return res;
    }

}


public class second_largest {
    public static void main(String[] args) {
        maximum maximumFinder = new maximum();
        int[] arr = {1, 3, 5, 6, 7, 8, 2};


        int largestIndex = maximumFinder.getmaximun(arr);
        int secondLargestIndex = maximumFinder.secondlargest(arr);

        System.out.println("Array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println("\nIndex of the largest element: " + largestIndex);
        System.out.println("Value of the largest element: " + arr[largestIndex]);

        System.out.println("Index of the second largest element: " + secondLargestIndex);
        System.out.println("Value of the second largest element: " + arr[secondLargestIndex]);
    }
}




