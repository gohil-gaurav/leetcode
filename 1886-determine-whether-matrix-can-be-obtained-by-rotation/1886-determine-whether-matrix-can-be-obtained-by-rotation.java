class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for(int i=0; i<4; i++){

            if(cheakEqual(mat, target)){
                return true;
            }

            for (int j = 0; j < n; j++) {
                for (int k = j; k < n; k++) {
                    int temp = mat[j][k];
                    mat[j][k] = mat[k][j];
                    mat[k][j] = temp;
                }
            }
            
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n / 2; k++) {
                    int temp = mat[j][k];
                    mat[j][k] = mat[j][n - 1 - k];
                    mat[j][n - 1 - k] = temp;
                }
            }
        }

        return false;
    }

    public boolean cheakEqual(int[][] mat, int[][] target){
        int n = mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}