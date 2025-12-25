package BinarySearch;

public class main {
    public static void main(String[] args) {
        // array should be sorted for binary search
        int[] arr = {1,2,12,23,55,56};
        int target = 12;
        int index = binarySearchAlgo(arr, target);
        if (index == -1){
            System.out.println("Element not found");
            return;
        }
        System.out.println("Element found at: "+index);
    }
    public static int binarySearchAlgo(int [] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int index = -1;
        while(low <= high){
            System.out.println(low +" "+high);
            int mid = low + (high-low)/2;
            if (target > arr[mid])
                low = mid+1;
            else if(target < arr[mid])
                high = mid-1;
            else{
                index = mid;
                return index;
            }
        }
        return index;
    }
}
