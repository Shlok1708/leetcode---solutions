class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> shlok = new HashSet<>();
        for(int i : nums){
            if(!shlok.add(i)){
                return true;
            }
        }
        return false; 
    }
}