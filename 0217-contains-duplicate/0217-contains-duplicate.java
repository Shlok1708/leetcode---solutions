class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> shlok = new HashSet<>();
        for(int i : nums){
            shlok.add(i);
        }
        return nums.length > shlok.size(); 
    }
}