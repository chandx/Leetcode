package Solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_101 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root== null) return true;
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        //BFS left prioritised
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode current= q.poll();
            if (current!= null){
                l1.add(current.val);
                q.add(current.left);
                q.add(current.right);
            }
            else {
                l1.add(Integer.MAX_VALUE);
            }
        }

        q.add(root);
        while (!q.isEmpty()){
            TreeNode current= q.poll();
            if (current!= null){
                l2.add(current.val);
                q.add(current.right);
                q.add(current.left);
            }
            else {
                l2.add(Integer.MAX_VALUE);
            }
        }
        for (int i= 0; i< l1.size(); i++){
            System.out.println(l1.get(i)+ "\t"+ l2.get(i));
        }

        if (l1.size()!= l2.size()) {
            System.out.println("different size");
            return false;
        }
        else {
            for (int i= 0; i< l1.size(); i++){
                if (!l1.get(i).equals(l2.get(i))) {
                    System.out.println("different num");
                    System.out.println(l1.get(i)+ "\t"+ l2.get(i));
                    return false;
                }
            }
            return true;
        }
    }
}
