
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int upper = 0, lower = m - 1;
        int start = 0, end = n - 1;

        while (upper <= lower && start <= end) {

            for (int i = start; i <= end; i++) {
                result.add(matrix[upper][i]);
            }
            upper++;

            for (int i = upper; i <= lower; i++) {
                result.add(matrix[i][end]);
            }
            end--;

            if (upper <= lower) {
                for (int i = end; i >= start; i--) {
                    result.add(matrix[lower][i]);
                }
                lower--;
            }

            if (start <= end) {
                for (int i = lower; i >= upper; i--) {
                    result.add(matrix[i][start]);
                }
                start++;
            }
        }

        return result;
    }
}