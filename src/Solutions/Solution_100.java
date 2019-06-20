package Solutions;


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution_100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p== null){
            return q== null;
        }
        else{
            if (q== null) return false;
            else return (p.val== q.val)&& isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
