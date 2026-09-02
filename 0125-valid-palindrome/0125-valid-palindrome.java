class Solution {
    public boolean isPalindrome(String s) {
    
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        
        return cleanedString.equals(reversedString);
    }
}