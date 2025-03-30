class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return bST(nums,0,nums.length-1);
    }
    private TreeNode bST(int[] nums, int s, int e){
        if(s>e){
            return null;
        }

        int m = s + (e-s) / 2;
        TreeNode r = new TreeNode(nums[m]);

        r.left = bST(nums, s, m-1);
        r.right = bST(nums, m+1, e);
        return r;
    }
}