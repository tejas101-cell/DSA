package MergeSort;

import java.util.Scanner;

public class Main {
    // implementing the merge method to diveide and merge the two sorted arrays
    public static void merge(int[] arr, int l, int m, int r){
        // take the sizes
        int n1 = m - l + 1;
        int n2 = r - m;

        // make two temporary arrays
        int []L = new int[n1];
        int []R = new int[n2];

        // divide the array and assign accordingly
        for (int i = 0; i < n1; i++){
            L[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++){
            R[i] = arr[m+i+1];
        }

        // compare elements from the divided arrays
        // update the current array
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

        // if there are any remaining elements then
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    // implementing the mergeSort method with recursion
    public static int[] mergeSort(int[]arr, int l, int r){
        if (l < r){
            int m = l + (r-l)/2;

            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            merge(arr, l, m, r);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        // enter the size input
        int size = sc.nextInt();
        int[]arr = new int[size];
        for (int i = 0; i < size; i++){
            // looping through to accept the elements
            System.out.print("Element "+(i+1)+"->");
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, arr.length-1);
        // print the sorted array
        // arr = mergeSort(arr, 0, arr.length-1);
        for (int i : arr){
            System.out.print("->"+i);
        }
    }
}
