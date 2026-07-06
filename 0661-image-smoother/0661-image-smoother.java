class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int sum = 0;
                int count = 0;

                for(int k=i-1; k<=i+1; k++){
                    for(int z=j-1; z<=j+1; z++){
                        if(k >= 0 && k<m && z>=0 && z<n){
                            sum += img[k][z];
                            count++;
                        }
                    }
                }
                result[i][j] = sum/count;
            }
        }
        return result;
    }
}