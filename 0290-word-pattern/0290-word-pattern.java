class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] shlok = s.split(" ");
        if(pattern.length() != shlok.length){
            return false;
        }

        for(int i = 0;i<pattern.length();i++){
            char a = pattern.charAt(i);
            String word = shlok[i];
            if(pattern.indexOf(a) != returnIndex(shlok,word)){
                return false;
            }
        }
        return true;
      

    }
      private int returnIndex(String [] a, String f){
            for(int i = 0;i<a.length;i++){
                if(a[i].equals(f)){
                    return i;
                }
            }
            return -1;
        }
}