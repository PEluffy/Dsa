package dsa;
public class Main {
    public static void main(String[] args) {
        int[] exampleArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int searchValue = 3;
        
        // binarySearch a = new binarySearch(exampleArray, searchValue);
        // int result=a.performBinarysearch();
        binarySearchRecursion a= new binarySearchRecursion(exampleArray,searchValue);
        int  result=a.performBinarySearch();
        if(result!=-1){
            System.out.println("Element founr at index"+result);
        }
        else{
            System.out.println("element not found");
        }
    }
}