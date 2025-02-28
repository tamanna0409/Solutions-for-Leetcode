class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose 
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Row reverse
        for(int i=0; i<n; i++){
            for(int j=0, k = n-1; j < k; j++, k--){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }
}