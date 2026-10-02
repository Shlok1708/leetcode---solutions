class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length*2;
        int end = nums.length;
        int [] shlok = new int [n];
        for(int i = 0;i<nums.length;i++){
            shlok[i] = nums[i];
            shlok[end+i] = nums[i];
        }
        return shlok;
    }
}