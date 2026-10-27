class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findStartIndex(nums, target);
        result[1] = findEndIndex(nums, target);
        return result;
    }
    
    // Helper method to find the first occurrence
    private int findStartIndex(int[] nums, int target) {
        int index = -1;
        int low = 0, high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] >= target) {
                high = mid - 1; // Left side me aur occurrences check karo
            } else {
                low = mid + 1;
            }
            
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }
    
    // Helper method to find the last occurrence
    private int findEndIndex(int[] nums, int target) {
        int index = -1;
        int low = 0, high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] <= target) {
                low = mid + 1; // Right side me aur occurrences check karo
            } else {
                high = mid - 1;
            }
            
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }
}