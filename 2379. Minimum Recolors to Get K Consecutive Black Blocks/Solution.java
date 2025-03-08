class Solution {
    public int minimumRecolors(String blocks, int k) {
        int bc = 0;
        int ans = Integer.MAX_VALUE;

        for(int i=0; i<blocks.length();i++){
            if(i-k>=0 && blocks.charAt(i-k)=='B') {
                bc--;
            }
            if(blocks.charAt(i)=='B'){
                bc++;
                //ans = Math.min(ans,k-bc);
            }

            ans = Math.min(ans,k-bc);
        }
        return ans;
    }
}