class Solution {
    public int maxArea(int[] height) {
        int start = 0,end = height.length-1,maxvalue = 0;
        while(start<end){
            int width = end-start;
            int maxheight = Math.min(height[start],height[end]);
            maxvalue = Math.max(maxvalue,maxheight*width);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }

        }
        return maxvalue;
        
    }
}