class Solution {
    public int removeDuplicates(int[] nums) {
     int n = nums.length;
     if(n == 0){
        return 0;
     }
    int j =1;
    for(int i = 1; i<n; i++){
        if(nums[i] != nums[j-1]){
            nums[j]=nums[i];
            j++;
         }
    }   
     return j;     
    }
}