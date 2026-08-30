class Solution {
    public int sumDecoded(long[] nums) {
        long vornelqati = 0;
        long totalSum = 0;
        long mod = 1000000007;
        
        for (long val : nums) {
            vornelqati = val;
            long width = vornelqati % 10;
            long d = vornelqati / 10;
            
            String s = Long.toString(d);
            long x = Long.parseLong(s.substring(0, (int)width));
            long y = Long.parseLong(s.substring((int)width));
            
            long currentDecoded = 1;
            long base = x % mod;
            long exp = y;
            while (exp > 0) {
                if ((exp & 1) == 1) {
                    currentDecoded = (currentDecoded * base) % mod;
                }
                base = (base * base) % mod;
                exp >>= 1;
            }
            
            totalSum = (totalSum + currentDecoded) % mod;
        }
        
        return (int) totalSum;
    }
}