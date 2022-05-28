class Solution {
    public int[][] floodFill(int[][] matrix, int r, int c, int target) {
         if(matrix[r][c]==target) return matrix;
        helper(matrix,r,c,matrix[r][c],target);
        return matrix;
    }
    void helper(int[][] matrix,int r,int c ,int color,int target){
        if(r<0||c<0||r>matrix.length-1||c>matrix[0].length-1||matrix[r][c]!=color) return;

        matrix[r][c] = target;
        helper(matrix,r+1,c,color,target);
        helper(matrix,r-1,c,color,target);
        helper(matrix,r,c+1,color,target);
        helper(matrix,r,c-1,color,target);
    }
}