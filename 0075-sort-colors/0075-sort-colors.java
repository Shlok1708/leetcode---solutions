class Solution {
    public void sortColors(int[] nums) {
        int s = 0, mid = 0, e = nums.length - 1;

        while (mid <= e) {
            if (nums[mid] == 0) {
                swap(nums, s, mid);
                s++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { 
                swap(nums, mid, e);
                e--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}