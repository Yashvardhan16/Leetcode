class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)&& helper(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
        
    }
    boolean helper(char[][] board,int i,int j , String word , int index){
        if(index==word.length()) return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(index)) return false;
        
        char temp = board[i][j];
        board[i][j] = '!';
        boolean duplicate = helper(board,i+1,j,word,index+1)||
            helper(board,i-1,j,word,index+1)||
            helper(board,i,j+1,word,index+1)||
            helper(board,i,j-1,word,index+1);
        board[i][j] = temp;
        return duplicate;
    }
}