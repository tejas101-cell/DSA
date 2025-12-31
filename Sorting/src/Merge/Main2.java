package Merge;

public class Main2 {
    public static void merge(int[]arr, int l, int m, int r){
        // first we will divide
        // get the sizes of right and left
        int n1 = m - l + 1;
        int n2 = r - m;

        //create temp
        int []L = new int[n1];
        int []R = new int[n2];

        // assign all the left and right to temp
        for (int i = 0; i < n1; i++){
            L[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++){
            R[i] = arr[m+1+i];
        }

        // after assigning sort those halves
        // initialize with some veriables
        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // remaining elements will be there from each halves
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static int[] mergeSort(int[]arr, int l, int r){
        if(l < r){
            int m = l + (r-l)/2;

            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr = {23,12,23,11,2,1};
        arr = mergeSort(arr, 0, arr.length-1);
        for (int i : arr){
            System.out.print("->"+i);
        }
    }
}
