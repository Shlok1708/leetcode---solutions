class Solution {
    public String frequencySort(String s) {
      
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        
        StringBuilder sc = new StringBuilder();
       
        for (int i = 0; i < s.length(); ) {
            int max = 0;
            int maxChar = 0;
         
            for (int j = 0; j < 128; j++) {
                if (count[j] > max) {
                    max = count[j];
                    maxChar = j;
                }
            }
           
            if (max == 0) break;
            
            for (int k = 0; k < max; k++) {
                sc.append((char) maxChar);
            }
            
            count[maxChar] = 0;
            i += max;
        }
        
        return sc.toString();
    }
}