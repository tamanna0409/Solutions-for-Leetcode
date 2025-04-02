class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return div(root.left,root.right);
    }
    public boolean div(TreeNode lroot, TreeNode rroot){
        if(lroot == null && rroot == null){
            return true;
        }
        if(lroot == null || rroot == null){
            return false;
        }
        if(lroot.val!=rroot.val){
            return false;
        }
        return div(lroot.left,rroot.right) && div(lroot.right,rroot.left);

    }
}