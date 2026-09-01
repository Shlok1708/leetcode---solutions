class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int shlok[] = new int [26];
        int alok[] = new int [26];
        for(int i = 0;i<s1.length();i++){
            shlok[s1.charAt(i)-'a']++;
            alok[s2.charAt(i)-'a']++;
        }
        if (Arrays.equals(shlok, alok)) {
            return true;
        }
        for(int i = s1.length();i<s2.length();i++){
            alok[s2.charAt(i)-'a']++;
            alok[s2.charAt(i - s1.length()) - 'a']--;
            if(Arrays.equals(shlok,alok)){
            return true;
        }
        }
        return false;
    }
}