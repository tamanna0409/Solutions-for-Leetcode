class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    public static boolean solve(char[][] board, int i, int j){
        if(i==9){
            return true;
        }
        if(j==9){
            return solve(board,i+1,0);
                   }
        if(board[i][j]!='.'){
            return solve(board, i, j+1);
            
                    }
        for(int no=1; no<=9; no++){
            if(check(board,i,j,no)){
                board[i][j]=(char)(no+'0');
                if(solve(board, i, j+1)){
                    return true;
                };
                board[i][j]='.';
                }
            }
            return false;
        }
    
    public static boolean check(char[][] board, int i, int j , int no){
        for(int k=0;k<9; k++){
            if(board[i][k]==(char)(no+'0')){
                return false;
            }
            if(board[k][j]==(char)(no+'0')){
                return false;
            }
        }
        int srow = 3*(i/3);
        int scol = 3*(j/3);
        for(int k=srow;k<srow+3;k++){
            for(int l=scol;l<scol+3;l++){
                if(board[k][l]==(char)(no+'0')){
                    return false;
                }
            }
        }
        return true;
    }
}