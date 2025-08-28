class Solution {
    public int areaOfMaxDiagonal(int[][] d){
        int n= d.length;
        int x =0;
        int m =0;
        for(int i=0;i<n;i++){
            int l= d[i][0];
            int w = d[i][1];
            int sq = (l*l + w*w);
            int y = l*w;

            if(sq>x){
                x = sq;
                m = y;
            }
            else if(x==sq){
                m = Math.max(m,y);
            }
        }
        return m;
    }
}