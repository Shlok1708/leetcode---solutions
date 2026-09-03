class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[128];
        for (char c : t.toCharArray()) map[c]++;
        
        int left = 0, right = 0, required = t.length();
        int minLen = Integer.MAX_VALUE, startIndex = 1;
        
        while (right < s.length()) {
            if (map[s.charAt(right++)]-- > 0) required--;
            
            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    startIndex = left;
                }
                if (map[s.charAt(left++)]++ == 0) required++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}