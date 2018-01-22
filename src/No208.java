/**
 * Created by wqlin on 18-1-22 20:19.
 */
public class No208 {
    class Trie {
        class TrieNode {
            TrieNode[] next;
            boolean isWord;

            public TrieNode() {
                next = new TrieNode[26];
                isWord = false;
            }
        }

        TrieNode node;

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            node = new TrieNode();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            TrieNode t = node;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (t.next[index] == null)
                    t.next[index] = new TrieNode();
                t = t.next[index];
            }
            t.isWord = true;
        }

        private TrieNode find(String word) {
            TrieNode t = node;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (t.next[index] == null)
                    return null;
                t = t.next[index];
            }
            return t;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            TrieNode result = find(word);
            return result != null && result.isWord;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            return find(prefix) != null;
        }
    }
}
