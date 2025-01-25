class Solution {
    public boolean isBalanced(TreeNode root) {
        if(hgt(root)==-1){
            return false;
        }
        else{
            return true;
        }
    }
    public static int hgt(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefthgt = hgt(root.left);
        int righthgt = hgt(root.right);
        if(lefthgt == -1 || righthgt == -1){
            return -1;
        }
        if(Math.abs(lefthgt-righthgt)>1){
            return -1;
        }
        return Math.max(lefthgt,righthgt) + 1;
    }
}