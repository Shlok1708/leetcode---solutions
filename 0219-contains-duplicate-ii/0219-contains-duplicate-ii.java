class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    
        HashSet<Integer> windowSet = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
     
            if (windowSet.contains(nums[i])) {
                return true;
            }
    
            windowSet.add(nums[i]);
            
       
            if (windowSet.size() > k) {
                windowSet.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}