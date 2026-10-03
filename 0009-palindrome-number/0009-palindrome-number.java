class Solution {
    public boolean isPalindrome(int x) {
        int orignal = x;
        int reverce = 0;
        while(x>0){
            int lastDigit = x%10;
            reverce = reverce*10+lastDigit;
            x = x/10;
        }
        return orignal == reverce;
    }
}