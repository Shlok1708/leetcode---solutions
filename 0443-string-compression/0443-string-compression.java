class Solution {
    public int compress(char[] chars) {
        int index = 0;
        for(int i = 0;i<chars.length;i++){
            char shlok = chars[i];
            int sameNumber =0;
            while(i<chars.length&&chars[i]==shlok){
                sameNumber++;
                i++;
            }
            if(sameNumber == 1){
                chars[index++] = shlok;

            }else{
               chars[index++] = shlok;
               String alok = String.valueOf(sameNumber);
                for(char shlok2 : alok.toCharArray()){
                    chars[index++] = shlok2;
                }
            }
            i--;
        }
        return index;
    }
}