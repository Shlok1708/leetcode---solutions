class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum =0,currentSum = 0;
        HashSet<Integer>shlok = new HashSet<>();
        int left = 0;
        for(int i = 0;i<nums.length;i++){
            while(shlok.contains(nums[i])|| shlok.size() ==k){
                currentSum -= nums[left];
                shlok.remove(nums[left]);
                left++ ;
            }
            shlok.add(nums[i]);
            currentSum += nums[i];
            if(shlok.size() == k){
                maxSum = Math.max(maxSum,currentSum);
            }
        }
        return maxSum;
    }
}