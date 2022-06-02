Given a 2D integer array matrix of mXn size, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal,
switching the matrix's row and column indices.


class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] ans=new int[n][m];
    
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
}