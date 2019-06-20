package Solutions;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution_129 {
    public int subsum(TreeNode self, int partial){
        int currentNum= partial*10 + self.val;
        int s= 0;
        if (self.left== null && self.right== null) {
            s= currentNum;
        }
        else{
            if (self.left!= null) s= s+ subsum(self.left, currentNum);
            if (self.right!= null) s= s+ subsum(self.right, currentNum);
        }
        return s;
    }
    public int sumNumbers(TreeNode root) {
        if (root== null) return 0;
        return subsum(root, 0);
    }
}
