class Solution {
    public int heightChecker(int[] heights) {
         int count = 0;
        int [] shlok = heights.clone();
         Arrays.sort(heights);
        for(int i = 0;i<heights.length;i++){
            if(shlok[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}