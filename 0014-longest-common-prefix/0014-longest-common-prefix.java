class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0|| strs == null){
         return "";
        }
        String shlok = strs[0];
        for(int i = 1;i<strs.length;i++){
            while(strs[i].indexOf(shlok) != 0){
                shlok = shlok.substring(0,shlok.length()-1);
                if(shlok.isEmpty()) return "";
            }
        }
        return shlok;
    }

}