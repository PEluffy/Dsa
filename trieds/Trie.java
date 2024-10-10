package trieds;

import java.util.ArrayList;
import java.util.List;

public class Trie {
     private TrieNode root;
     public Trie(){
        root=new TrieNode();
     }
     public void insert(String word){
       TrieNode currentNode=root;
       char[] charArray=word.toLowerCase().toCharArray();
       for(char ch:charArray){
           int index=ch-'a';
           if(currentNode.children[index]==null){
            currentNode.children[index]=new TrieNode();
           }
           currentNode=currentNode.children[index];
       }
       currentNode.isEndOfWord=true;
     }
     public List<String> searchByPrefix(String prefix){
      TrieNode currentNode=root;
      List<String> result=new ArrayList<>();
        char[] charArray=prefix.toLowerCase().toCharArray();
        for(char ch:charArray){
         int index=ch-'a';
         if(currentNode.children[index]==null){
            return result;
         }
         currentNode=currentNode.children[index];
        }
        findAllWords(currentNode,new StringBuilder(prefix),result);//list passed as a reference 
        return result;
     }

     public void findAllWords(TrieNode currNode,StringBuilder prefix,List<String> result){
                      if(currNode.isEndOfWord){
                         result.add(prefix.toString());
                      }
                      for(int i=0;i<26;i++){
                        if(currNode.children[i]!=null){
                           char nextChar=(char) ('a'+i);
                           prefix.append(nextChar);
                           findAllWords(currNode.children[i],prefix,result);
                           prefix.deleteCharAt(prefix.length() - 1);
                        }
                      }
     }
}
