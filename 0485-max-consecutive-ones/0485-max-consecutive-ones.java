class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,current =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
                current = Math.max(count ,current);
            }else{
                count = 0;
            }

        }
        return current;
    }
}