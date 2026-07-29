class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length,shlok = 0;
        Arrays.sort(nums); 
       shlok = nums[n/2];
        return shlok;
    } 
}