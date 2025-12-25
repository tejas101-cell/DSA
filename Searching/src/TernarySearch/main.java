package TernarySearch;
// example to find minumum element in the array
// having the O(log n) time complexity
// works only on unimodal array
// unimodal means that array onces goes descending and then ascedning but after peak there should be some element to strictly decrease
public class main {
    public static void main(String[] args) {
        // unimodal array
        // first increasing
        int[] arr = {20, 15, 10, 5, 6, 7, 8, 9};
        int []arr1 = {9,7,5,4,8,10,11};
        int[] arr2 = {10, 8, 6, 2, 3, 5, 7};

        int Minindex1 = ternarySearchAlgo(arr1);

        int Minindex = ternarySearchAlgo(arr);

        int Minindex2 = ternarySearchAlgo(arr2);

        System.out.println("Minimum Element found at: "+Minindex);
        System.out.println("Minumum Element found in arr1 at : "+Minindex1);
        System.out.println("Minumum : "+ Minindex2);
    }
    public static int ternarySearchAlgo(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int index = -1;

        while (low <= high){

            // dividing the array into the
            int mid1 = low + (high-low)/3;
            int mid2 = high - (high-low)/3;
            System.out.println(mid1+" "+mid2);

            if(arr[mid1] == arr[mid2]){
                high = mid2-1;
                low = mid1+1;
                index = mid1;
            }
            else if(arr[mid1] < arr[mid2]){
                high = mid2-1;
                index = mid1;
            }
            else {
                low = mid1 + 1;
                index = mid2;
            }
        }
        return index;
    }
}
