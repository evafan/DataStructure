package lib;

import java.util.ArrayList;

class TrieNode{

    /**26 english characters, default 26*/
    private int childrenNum = 26;
    TrieNode[] children;
    boolean isWord;

    TrieNode(){
        this.isWord = false;
        this.children = new TrieNode[childrenNum];
    }

    public TrieNode(int num){
        this.childrenNum = num;
        this.isWord = false;
        this.children = new TrieNode[childrenNum];
    }

    public int getChildrenNum(){
        return this.childrenNum;
    }
}
public class Trie {

    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr = root;
        for(char w : word.toCharArray()) {
            if (curr.children[w - 'a'] == null) {
                curr.children[w - 'a'] = new TrieNode();
            }
            curr = curr.children[w - 'a'];
        }
        curr.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr = root;
        for(char w : word.toCharArray()){
            if(curr.children[w-'a']==null){
                return false;
            }
            curr = curr.children[w-'a'];
        }
        return curr.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(char w : prefix.toCharArray()){
            if(curr.children[w-'a']==null){
                return false;
            }
            curr = curr.children[w-'a'];
        }
        return true;
    }
}
