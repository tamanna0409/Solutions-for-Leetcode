class Solution {
    public int missingNumber(int[] nums) {
        int x = nums.length;

        for(int i=0;i<nums.length;i++){
            x= x+ i-nums[i];
        }
        return x;
    }
}