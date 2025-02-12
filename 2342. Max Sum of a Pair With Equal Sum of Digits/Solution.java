public class Solution {
    public int maximumSum(int[] nums) {
        int [] m = new int[82];
        int ans = -1;
        for(int x:nums){
            int sum = 0;
            int t = x;
            while(t!=0){
                sum += t %10;
                t /= 10;
            }
            if(m[sum]!=0){
                ans = Math.max(ans, x+m[sum]);
            }
            m[sum] = Math.max(m[sum],x);
        }
        return ans;
    }
}