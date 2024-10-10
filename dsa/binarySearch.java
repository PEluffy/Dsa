package dsa;
public class binarySearch {
    int[] arr;
    int searchValue;

    public binarySearch(int[] arr, int searchValue) {
        this.arr = arr;
        this.searchValue = searchValue; 
    }

    public int performBinarysearch(){

        int start=0;
        int end=arr.length-1;
         while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==searchValue){
                return mid;
            }
            if(searchValue>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
         } 
         return -1;
    }
}
