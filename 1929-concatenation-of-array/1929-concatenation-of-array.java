class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length*2;
        int end = nums.length;
        int ans[] = new int[n];
        for(int i = 0;i<end;i++){
            ans[i] = nums[i];
            ans[i+end] = nums[i];
          
        }
        return ans;
    }
}