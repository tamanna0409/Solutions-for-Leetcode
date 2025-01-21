class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        boolean[][] mat = new boolean[n][n];
        nQueen(n,0,mat,list);
        return list;
    }
    public static void nQueen(int n,int i, boolean[][] mat, List<List<String>> list){
        if(i==n){
            listAdd(mat, list);
        }
        for(int j=0; j<n; j++){
            if(isSafe(mat,i,j)){
                mat[i][j]=true;
                nQueen(n,i+1,mat,list);
                mat[i][j]=false;
            }
        }
    }
    public static boolean isSafe(boolean [][] mat, int i, int j){
        for(int k=i-1;k>=0;k--){
            if(mat[k][j]){
                return false;
            }
        }
        for(int k=i-1,l=j-1;k>=0 && l>=0; k--,l--){
            if(mat[k][l]){
                return false;
            }
        }
        for(int k=i-1, l=j+1;k>=0 && l<mat.length; k--, l++){
            if(mat[k][l]){
                return false;
            }
        }
        return true;
    }
    public static void listAdd(boolean[][] mat, List<List<String>> list){
        List<String> l = new ArrayList<>();
        for(int i=0; i<mat.length;i++){
            String str = "";
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]){
                    str +="Q";
                }
                else{
                    str+=".";
                }
            }
            l.add(str);
        }
      list.add(l);  
    }

}