class Solution {
    public int[] decompressRLElist(int[] nums) {
        List <Integer> result = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i += 2){
            int shlok = nums[i];
            int alok =  nums[i+1];
            for(int j = 0;j<shlok;j++){
                result.add(alok);
            }
        }
         return result.stream().mapToInt(i -> i).toArray();
    }
}