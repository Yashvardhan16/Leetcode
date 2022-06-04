class Solution {
    public int[][] diagonalSort(int[][] mat) {
       for(int i=0;i<mat.length;i++){
           helper(mat,i,0);
       } 
        for(int i=mat[0].length-1;i>0;i--){
           helper(mat,0,i);
       } 
        return mat;
    }
    void helper(int[][] matrix, int r,int c){
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i=r, j=c;i<matrix.length && j<matrix[0].length;i++,j++){
            
                pq.add(matrix[i][j]);
                
        }
                while(pq.size()>0)
                    matrix[r++][c++] = pq.poll();
            
        
    }
}