class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows <= 0) return triangle;
        
        // Pehli row hamesha [1] hoti hai
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            
            // Har row ki shuruat 1 se hoti hai
            currRow.add(1);
            
            // Beech ke elements calculate karo
            for (int j = 1; j < prevRow.size(); j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // Har row ka ant 1 par hota hai
            currRow.add(1);
            
            triangle.add(currRow);
        }
        
        return triangle;
    }
}