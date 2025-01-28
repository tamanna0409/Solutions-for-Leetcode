class Solution {
    public static class Pair{
        int height;
        int diameter;
        Pair(){

        }
        Pair(int h, int d){
            this.height = h;
            this.diameter = d;
        }

    }
    public int diameterOfBinaryTree(TreeNode root) {
        return recursive(root).diameter;
    }
    public static Pair recursive(TreeNode root){
        if(root==null){
            return new Pair(0,0);
        }
        Pair l = recursive (root.left);
        Pair r = recursive(root.right);

        int returnDiameter = Math.max(Math.max(l.diameter, r.diameter),l.height+r.height);
        int returnHeight = Math.max(l.height, r.height)+1;
        return new Pair(returnHeight, returnDiameter);
    }
}