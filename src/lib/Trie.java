package lib;

import java.util.ArrayList;

class TrieNode{

    private String val;
    /**26 english characters, default 26*/
    private int childrenNum = 26;
    private TrieNode[] children;

    TrieNode(){
        this.val = "";
        this.children = new TrieNode[childrenNum];
    }

    public TrieNode(int num){
        this.childrenNum = num;
        this.val = "";
        this.children = new TrieNode[childrenNum];
    }

    public int getChildrenNum(){
        return this.childrenNum;
    }
}
public class Trie {

    private TrieNode root;
    private String val;
    /**26 english characters*/
    private int childrenNum = 26;
    TrieNode[] children = new TrieNode[childrenNum];

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
        val = "";
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {

    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return false;
    }
}
