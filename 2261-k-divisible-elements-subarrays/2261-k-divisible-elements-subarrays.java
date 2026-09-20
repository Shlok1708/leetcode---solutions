import java.util.HashSet;

class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        HashSet<String> distinctSubarrays = new HashSet<>();
        int n = nums.length;
      
        for (int i = 0; i < n; i++) {
            int divisibleCount = 0;
            StringBuilder sb = new StringBuilder();
           
            for (int j = i; j < n; j++) {
           
                if (nums[j] % p == 0) {
                    divisibleCount++;
                }
                
             
                if (divisibleCount > k) {
                    break;
                }
                
                sb.append(nums[j]).append(",");
            
                distinctSubarrays.add(sb.toString());
            }
        }
     
        distinctSubarrays.add("");
        return distinctSubarrays.size() - 1; // 
    }
}