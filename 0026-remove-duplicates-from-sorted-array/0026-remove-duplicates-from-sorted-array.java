class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer>shlok = new TreeSet<>();
        for(int i = 0;i<nums.length;i++){
            shlok.add(nums[i]);
        }
        int k = 0;
        for(int i : shlok){
            nums[k] = i; 
            k++;
        }
        return shlok.size();
        
    }
}