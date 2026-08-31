class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder ans = new StringBuilder(s);
        while(ans.indexOf(part)!=-1){
            int start = ans.indexOf(part);
            int e = start+part.length();
            ans.delete(start,e);
        }
        return s = ans.toString();

        
    }
}