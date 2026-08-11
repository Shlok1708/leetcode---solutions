class Solution {
    public int missingInteger(int[] nums) {
        int sum  = nums[0];
        int i = 1;
        while(i<nums.length && nums[i]==nums[i-1]+1){
            sum = nums[i]+sum;
            i++;
        }
        int x = sum;
        while(true){
            boolean found = false;
            for( i = 0;i<nums.length;i++){
                 if(nums[i]==x){
                found  = true;
            }
            }
            if(!found){
                return x;
            } 
            x++;
        } 
    }
}