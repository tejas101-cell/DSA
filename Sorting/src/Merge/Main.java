package Merge;

public class Main {
    public static void merge(int[]arr, int f, int m, int l){
        // find sizes
        int n1 = m - f + 1;
        int n2 = l - m;

        // create temporary array for left and right
        int[]L = new int[n1];
        int[]R = new int[n2];

        // copy data
        for (int i = 0; i < n1; i++){
            L[i] = arr[f+i];
        }
        for (int j = 0; j < n2; j++){
            R[j] = arr[m+j+1];
        }

        // initial indices of second and first subarrays
        int i = 0; int j = 0;

        int k = f;
        while(i < n1 && j <n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i<n1){
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
    public static int[] mergeSort(int[]arr, int f, int l){
        if (f < l){
            // find middle
            int m = f + (l-f)/2;

            // sort 1st and 2nd halves
            mergeSort(arr, f, m);
            mergeSort(arr, m+1, l);

            merge(arr, f, m, l);
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
