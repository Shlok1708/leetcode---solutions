class Solution {
    public String removeDuplicates(String s) {
        StringBuilder shlok = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char value = s.charAt(i);
            int length = shlok.length();
            if(length>0&&shlok.charAt(length-1)==value){
                shlok.deleteCharAt(length-1);
            }else{
                shlok.append(value);
            }
        }
        return shlok.toString();
    }
}