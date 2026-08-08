class Solution {
    public int removeElement(int[] nums, int val) {
        int shlok = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[shlok] = nums[i];
                shlok++;
            }
        }return shlok;
        
    }
}