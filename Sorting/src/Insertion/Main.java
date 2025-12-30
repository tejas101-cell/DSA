package Insertion;

public class Main {
    public static int[] insertionSort(int[] arr){
        int l = arr.length;
        for (int i = 1; i < l; i++){
            int key = arr[i];
            int j = i - 1;

            // kind of hypothetical shifting is done here
            // keep shifting the elements unless you find the element less than the key
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[]arr = {12,23,342,12,11,322,1,2,3,4,545,2323,43,2323,34};
        arr = insertionSort(arr);
        for (int i : arr){
            System.out.print(" ++ "+i);
        }
    }
}
