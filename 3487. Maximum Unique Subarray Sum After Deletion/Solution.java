class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);

        int sum = nums[nums.length-1];
        int p = sum;
        for(int i=nums.length-2;i>=0 && nums[i]>=0;p = nums[i],i--){
            if(nums[i]!=p){
                sum+=nums[i];
            }
        }
        return sum;
    }
}