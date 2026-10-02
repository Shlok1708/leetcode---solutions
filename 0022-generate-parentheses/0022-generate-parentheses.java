class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, StringBuilder current, int open, int close, int max) {
        // Base case: jab combination ki length 2 * n ho jaye
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }
        
        // Agar open brackets abhi n se kam hain, toh '(' add kar sakte hain
        if (open < max) {
            current.append('(');
            backtrack(result, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
        
        // Agar close brackets open se kam hain, toh ')' add kar sakte hain
        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }
}