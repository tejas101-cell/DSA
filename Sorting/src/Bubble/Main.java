package Bubble;
// complexity : O(n^2)
// slowly range of the bubble is decreasing

// you prioratize the max value here
public class Main {
    public static int[] bubbleSort(int[]arr){
        int l = arr.length;
        // setting up flag
        boolean swapped;
        for (int i = 0; i < l-1; i++){
            swapped = false;
            for (int j = 0; j < l-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // if no need of swapping then
            // no need of sorting
            if (!swapped){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,23,43,23,42,12,32,43,5423,12,234,534,232312,323,434,5423,12132,3435};
        arr = bubbleSort(arr);
        for (int i : arr){
            System.out.print(" ++ "+i);
        }
    }
}
