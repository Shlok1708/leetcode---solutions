class Solution {
    public int[] productExceptSelf(int[] nums) {
      int shlok[] = new int [nums.length];
      shlok[0] = 1;
      for(int i = 1;i<nums.length;i++){
        shlok[i] = shlok[i-1]*nums[i-1];
      }
      int ans = 1;
      for(int i = nums.length-1;i>=0;i--){
        shlok[i] = shlok[i]*ans;
        ans  = ans*nums[i];
      }  
      return shlok;
    }
}


