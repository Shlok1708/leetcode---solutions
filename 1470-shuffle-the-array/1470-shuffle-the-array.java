class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] shlok = new int[n];
        int [] alok = new int[n];
        for(int i = 0;i<n;i++){
            shlok[i] = nums[i];
        }
        int index = 0;
        for(int i = n;i<nums.length;i++){
           alok[index] = nums[i];
           index++;
        }
        int o = 0,p = 0;
        for(int i = 0;i<nums.length;i++){
            if(i%2 == 0){
                nums[i] = shlok[o++];
            }else{
                nums[i] = alok[p++];
            }
        }

        return nums;
    }
}