class Solution {
    public void reverseString(char[] b) {
       int s = 0,e = b.length-1;
       while(s<e){
        char temp = b[s];
        b[s] = b[e];
        b[e] = temp;
        s++;
        e--;
       }

        
    }
}