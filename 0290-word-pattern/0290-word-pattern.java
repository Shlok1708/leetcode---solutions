class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false;
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
        
            if (pattern.indexOf(c) != findWordIndex(words, w)) {
                return false;
            }
        }
        
        return true;
    }
   
    private int findWordIndex(String[] words, String target) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}