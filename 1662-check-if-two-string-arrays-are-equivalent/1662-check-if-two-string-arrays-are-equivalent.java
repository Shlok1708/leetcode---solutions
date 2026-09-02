class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum  = word1[0],sums = word2[0]; 
        for(int i = 1;i<word1.length;i++){
            sum += word1[i];
        }
        for(int i = 1;i<word2.length;i++){
            sums += word2[i];
        }
        if(sums.equals(sum)){
            return true;
        }
        return false;
        
    }
}