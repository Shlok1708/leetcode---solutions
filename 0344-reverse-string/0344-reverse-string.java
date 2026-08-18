class Solution {
    public void reverseString(char[] s) {
        int rigth = 0,left = s.length-1;
        while(rigth<left){
            char temp = s[rigth];
            s[rigth] = s[left];
            s[left] = temp;
            left--;
            rigth++;
        } 
        
    }
}