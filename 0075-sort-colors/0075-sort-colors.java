class Solution {
    public void sortColors(int[] nums) {
        int first = 0  ,second = 0 , third = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0) first++;
            else if(nums[i] == 1) second++;
            else third++;
        }
         int count = 0;
         for(int i = 0;i<first;i++){
            nums[count] = 0;
            count++;
         }
          for(int i = 0;i<second;i++){
            nums[count] = 1;
            count++;
         }
        
         for(int i = 0;i<third;i++){
            nums[count] = 2;
            count++;
         }
        
        
    }
}