package Bubble;
// bubble sort cuz slowly we are decreasing the size of range and swapping
public class Main2 {
    public static int[] bubbleSort(int[]arr){
        int l = arr.length;
        boolean flag;
        for (int i = 0; i<l-1; i++){
            flag = false;
            for (int j = 0; j<l-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr = {12,32,12,1,2,3,43,231,2,4378,334342};
        arr = bubbleSort(arr);
        for (int i : arr){
            System.out.print("-> "+i);
        }
    }
}
