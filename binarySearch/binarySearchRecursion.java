package binarySearch;

public class binarySearchRecursion {

    int[] arr;
    int searchValue;

    public binarySearchRecursion(int[] arr, int searchValue) {
        this.arr = arr;
        this.searchValue = searchValue; 
    }
    public int performBinarySearch(){
        return performBinarySearchRecursive(0,arr.length-1);
       }
       private int performBinarySearchRecursive(int start,int end){
         if(start>=end){
            return -1;
         }
            int mid=(start+end)/2;
            if(searchValue==arr[mid]){
                return mid;
            }
            else if(searchValue>arr[mid]){
                return performBinarySearchRecursive(mid+1, end);
            }
            else{
              return   performBinarySearchRecursive(start, mid-1);
            }
       }
    
}
