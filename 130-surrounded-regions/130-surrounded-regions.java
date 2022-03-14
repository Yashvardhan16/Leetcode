class Solution {
    public void solve(char[][] board) {
        if(board.length==0||board[0].length==0) return;
        int n = board.length;
        int m = board[0].length;
       		for(int i=0;i<n;i++){
			if(board[i][0] =='O'){
				helper(board, i, 0);
			}

		}

		// last column
		for(int i=0;i<n;i++){
			if(board[i][m-1] =='O'){
				helper(board, i, m-1);
			}

		}

		// first row
		for(int i=0;i<m;i++){
			if(board[0][i] =='O'){
				helper(board, 0,i);
			}

		}

		// last row
		for(int i=0;i<m;i++){
			if(board[n-1][i] =='O'){
				helper(board, n-1,i);
			}

		}


		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(board[i][j] =='O'){
					board[i][j] = 'X';
				}
			}

		}


		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(board[i][j] =='V'){
					board[i][j] = 'O';
				}
			}
		}

	}
    
    void helper(char[][] board,int i,int j){
        if(i>board.length-1||j>board[0].length-1||i<0||j<0||board[i][j]!='O') return;
        
        board[i][j] = 'V';
        helper(board,i-1,j);
         helper(board,i+1,j);
         helper(board,i,j-1);
         helper(board,i,j+1);
    }
}