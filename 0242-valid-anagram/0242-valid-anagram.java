class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        char shlok[] = s.toCharArray();
         char alok[] = t.toCharArray();
         Arrays.sort(shlok) ;
          Arrays.sort(alok);
          return Arrays.equals(shlok,alok);
    }
}