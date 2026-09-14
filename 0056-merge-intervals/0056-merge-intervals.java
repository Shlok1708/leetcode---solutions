class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Agar intervals khali hain ya sirf ek hi interval hai, toh wahi wapas kar do
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        
        // Step 2: Intervals ko starting time ke hisaab se ascending order mein sort karo
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Step 3: Ek dynamic list banao jisme hum non-overlapping aur merged intervals rakhenge
        List<int[]> mergedList = new ArrayList<>();
        
        // Step 4: Har interval par ek-ek karke loop chalao
        for (int[] currentInterval : intervals) {
            
            // Agar list khaali hai, ya pichhla interval current wale se overlap nahi karta
            if (mergedList.isEmpty() || mergedList.get(mergedList.size() - 1)[1] < currentInterval[0]) {
                mergedList.add(currentInterval);
            } 
            else {
                // Agar overlap ho raha hai, toh pichle interval ke end time ko bada kar do
                int[] lastInterval = mergedList.get(mergedList.size() - 1);
                lastInterval[1] = Math.max(lastInterval[1], currentInterval[1]);
            }
        }
        
        // Step 5: List ko wapas 2D array mein convert karke return kar do
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}