package Insertion;
// we have key value here

// prioratizing the min value but checking from the end to start
public class Main2 {
    public static int[] insertionSort(int[]arr){
        int j;
        int l = arr.length;
        for (int i = 1; i<l; i++){
            int key = arr[i];
            for (j = i-1; j>=0;j--){
                // hypothetically shifting the key
                // as it is always getting compared
                if (arr[j] > key){
                    arr[j+1] = arr[j];
                }
                // j should decrement only when the arr[j] > key
                else {
                    break;
                }
            }
            // at last key which is compared with the previous every elements
            // it is adjusted at the ideal position
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr = {21,23,12,32,1254,657,3423,23,3,45,6,7,8,923,2};
        arr = insertionSort(arr);
        for (int i : arr){
            System.out.println("-> "+i);
        }
    }
}
