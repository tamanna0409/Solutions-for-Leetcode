class Solution {
    int preId, postId;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
    
        TreeNode r = new TreeNode(preorder[preId]);
        preId++;

        if(r.val!=postorder[postId]){
            r.left = constructFromPrePost(preorder,postorder);
        }
        if(r.val!=postorder[postId]){
            r.right = constructFromPrePost(preorder,postorder);
        }
        postId++;
        return r;
    }
}