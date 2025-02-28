class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int x = 3;
        int y = 2;
        int z = 0;

        for(int i =3;i<n;i++){
            z = x+y;
            y = x;
            x = z;
        }
        return z;
    }
}