class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> shlok = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            shlok.add(nums[i]);
        }
        return nums.length > shlok.size(); 
    }
}