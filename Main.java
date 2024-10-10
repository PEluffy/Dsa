import java.util.List;
import trieds.Trie;

public class Main {
    public static void main(String[] args) {
        // int[] exampleArray = {1, 3, 5, 7, 9, 11, 13, 15};
        // int searchValue = 7;
        
        // binarySearch a = new binarySearch(exampleArray, searchValue);
        // int result=a.performBinarysearch();
        // binarySearchRecursion a= new binarySearchRecursion(exampleArray,searchValue);
        // int  result=a.performBinarySearch();
        // if(result!=-1){
        //     System.out.println("Element founr at index"+result);
        // }
        // else{
        //     System.out.println("element not found");
        // }
          Trie trie = new Trie();
        trie.insert("Ashish");
        trie.insert("Asim");
        trie.insert("Asmina");
        trie.insert("Arjun");
        trie.insert("Bibek");
        trie.insert("Sita");
        trie.insert("Suraj");
        trie.insert("Sunita");
        trie.insert("Simran");
        trie.insert("Sameer");
        trie.insert("Ajay");
        trie.insert("Anita");
        trie.insert("Amrita");
        trie.insert("Bishal");
        trie.insert("Anup");
        trie.insert("Aryan");
        trie.insert("Anupa");

        List<String> result = trie.searchByPrefix("A");
        System.out.println("Names starting with 'As': " + result); // Output: [Ashish, Asim, Asmina]

        result = trie.searchByPrefix("Si");
        System.out.println("Names starting with 'Si': " + result); // Output: [Sita, Simran]

        result = trie.searchByPrefix("Su");
        System.out.println("Names starting with 'Su': " + result); // Output: [Suraj, Sunita]

        result = trie.searchByPrefix("A");
        System.out.println("Names starting with 'A': " + result); // Output: [Ashish, Asim, Asmina, Arjun, Ajay, Anita, Amrita, Anup, Aryan]

        result = trie.searchByPrefix("B");
        System.out.println("Names starting with 'B': " + result); // Output: [Bibek, Bishal]
    }
}