import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int min_ele = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < min_ele) {
                    min_ele = matrix[i][j];
                }
            }
            min.add(min_ele);
        }

        for (int j = 0; j < n; j++) {
            int max_ele = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > max_ele) {
                    max_ele = matrix[i][j];
                }
            }
            max.add(max_ele);
        }

        for (int i = 0; i < min.size(); i++) {
            int val = min.get(i);
            if (max.contains(val)) {
                num.add(val);
            }
        }

        return num;
    }
}