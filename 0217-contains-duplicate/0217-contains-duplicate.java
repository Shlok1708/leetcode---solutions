class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> shlok = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            shlok.add(nums[i]);
        }
       if(nums.length != shlok.size()){
        return true;
       }
        return false;
    }
}