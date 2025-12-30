package Selection;
// Complexity O(n^2)
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] selectionSort(int[]arr){
        int l = arr.length;
        for (int i = 0; i<l; i++){
            // taeget the i'th element
            int min_idx = i;
            for (int j = i+1; j<l; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            // replace when minimum is found
            // i'th position will get filled up with the min
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {1,23,4,5,56,3,3,23,43,545,6,34,23};
        int []arr1 = selectionSort(arr);
        for (int i : arr1){
            System.out.print(" ** "+i);
        }
    }
}