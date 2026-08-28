class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        
        // Try every possible starting point for the substring
        for (int i = 0; i < n; i++) {
            boolean[] seen = new boolean[256];
            
            for (int j = i; j < n; j++) {
                char currentChar = s.charAt(j);
              
                if (seen[currentChar]) {
                    break;
                }
          
                seen[currentChar] = true;
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        
        return maxLength;
    }
}