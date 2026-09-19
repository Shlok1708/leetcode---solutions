
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index -> {number: index}
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement is already in our map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, put the current number and its index into the map
            map.put(nums[i], i);
        }
        
        return new int[] {}; // Return empty array if no solution found
    }
}