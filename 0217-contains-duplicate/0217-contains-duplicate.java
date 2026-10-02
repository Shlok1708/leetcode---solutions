class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> shlok = new HashSet<>();
        for(int i : nums){
           shlok.add(i);
           if(nums.length == shlok.size()){
            return false;
           }
        }
        return true; 
    }
}