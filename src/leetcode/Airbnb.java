package leetcode;

import java.util.Collections;
import java.util.List;

import com.sun.deploy.util.ArrayUtil;
import lib.Trie;

public class Airbnb {

    private String reverseStr(String word){
        int i = 0;
        int j = word.length()-1;
        char[] wordArray = word.toCharArray();
        while(i<j){
            char temp = wordArray[i];
            wordArray[i] = wordArray[j];
            wordArray[j] = temp;
        }
        return wordArray.toString();
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        Trie wordTrie = new Trie();
        for(String word : words){
            wordTrie.insert(reverseStr(word));
        }
        for(String word: words){

        }
    }
}
