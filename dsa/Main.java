package dsa;
public class Main {
    public static void main(String[] args) {
        int[] exampleArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int searchValue = 13;
        
        binarySearch a = new binarySearch(exampleArray, searchValue);
        int result=a.performBinarysearch();
        if(result!=-1){
            System.out.println("Element founr at infex"+result);
        }
        else{
            System.out.println("element not found");
        }
    }
}