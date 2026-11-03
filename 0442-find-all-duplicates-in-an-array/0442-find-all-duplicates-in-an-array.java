class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>shlok = new ArrayList<>();
        int count = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[count]){
                shlok.add(nums[i]);
            }
            count++;
        }
        return shlok;
    }
}