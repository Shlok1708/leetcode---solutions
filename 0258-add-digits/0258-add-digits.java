class Solution {
    public int addDigits(int num) { 
        int ans1,ans2;
        while(num>9){
         ans1 = num/10;
         ans2 = num%10;
         num = ans1+ans2;
        }
        return num;
    }
}