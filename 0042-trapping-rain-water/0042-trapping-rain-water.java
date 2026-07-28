class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int lmax = 0;
        int rmax = 0;
        int ans = 0;
        while(start<end){
            lmax = Math.max(lmax,height[start]);
            rmax = Math.max(rmax,height[end]);
            if(lmax<rmax){
                ans += lmax-height[start];
                start++;
            }else{
                ans += rmax-height[end];
                end--;
            }


        }
        return ans;

    }
}