class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Step 1: Agar ransomNote bada hai magazine se, toh possible nahi hai
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        
        // Step 2: Frequency array for 26 lowercase English letters
        int[] count = new int[26];
        
        // Step 3: Magazine ke characters ki counting store karo
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Step 4: RansomNote ke characters ke liye frequency minus karo
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            // Step 5: Agar count negative hua, matlab letter kam pad gaya
            if (count[c - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}