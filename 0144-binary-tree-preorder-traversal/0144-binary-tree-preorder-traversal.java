class Solution {
    List<Integer> lst = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root ==null) return lst ;
        lst.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return lst;
    }
}