class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;
        
        while (i >= 0) {
            int j = i;
            
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
        
            result.append(s.substring(j + 1, i + 1));
            result.append(" ");

            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }
            
            i = j;
        }
        
        return result.toString().trim();
    }
}