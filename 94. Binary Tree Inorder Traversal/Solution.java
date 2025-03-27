class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        while(root!=null|| !s.isEmpty()){
            while(root!=null){
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            r.add(root.val);
            root = root.right;
        }
        return r;
    }
}