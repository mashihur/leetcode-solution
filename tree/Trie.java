package tree;

/*
 * L208
 * Company : Twitter, Facebook, Microsoft, Bloomberg, Uber, Google
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class Trie {
    Trie[] children;
    boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        Trie trie = this;
        for (int i = 0; i < word.length(); i++) {
            int pos = word.charAt(i) - 'a';
            if (trie.children[pos] == null) {
                Trie localTrie = new Trie();
                trie.children[pos] = localTrie;
                trie = localTrie;
            } else {
                trie = trie.children[pos];
            }
        }
        trie.isEnd = true;
    }

    public boolean search(String word) {
        Trie trie = this;
        for (int i = 0; i < word.length(); i++) {
            trie = trie.children[word.charAt(i) - 'a'];
            if (trie == null) {
                return false;
            }
        }
        return trie.isEnd;
    }

    public boolean startsWith(String prefix) {
        Trie trie = this;
        for (int i = 0; i < prefix.length(); i++) {
            trie = trie.children[prefix.charAt(i) - 'a'];
            if (trie == null) {
                return false;
            }
        }
        return true;
    }
    
////////////// Can be solved using HashMap but time & space complexity increases //////////////
//    private HashMap<Character, Trie> map;
//    boolean isEnd;
//
//    public Trie() {
//        map = new HashMap<>();
//        isEnd = false;
//    }
//
//    public void insert(String word) {
//        Trie trie = this;
//        for (int i = 0; i < word.length(); i++) {
//            char temp = word.charAt(i);
//            if  (trie.map.containsKey(temp)) {
//                trie = trie.map.get(temp);
//            } else {
//                Trie localTrie = new Trie();
//                trie.map.put(temp, localTrie);
//                trie = localTrie;
//            }
//        }
//        trie.isEnd = true;
//    }
//
//    public boolean search(String word) {
//        Trie trie = this;
//        for (int i = 0; i < word.length(); i++) {
//            char temp = word.charAt(i);
//            if (trie.map.containsKey(temp)) {
//                trie = trie.map.get(temp);
//            } else {
//                return false;
//            }
//        }
//        return trie.isEnd;
//    }
//
//    public boolean startsWith(String prefix) {
//        Trie trie = this;
//        for (int i = 0; i < prefix.length(); i++) {
//            char temp = prefix.charAt(i);
//            if (trie.map.containsKey(temp)) {
//                trie = trie.map.get(temp);
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }

}
