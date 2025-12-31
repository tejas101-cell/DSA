package Selection;

public class Main2 {
    public static int[] selectionSort(int[]arr){
        int l = arr.length;
        for(int i = 0; i<l; i++){
            int minIndex = i;
            for (int j = i+1; j<l; j++){
                // go forward and check if it is minumum or not
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {1,23,4,5,56,3,3,23,43,545,6,34,23};
        arr = selectionSort(arr);
        for (int i : arr){
            System.out.print("->"+i);
        }
    }
}
