import java.util.*;
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode root;

        TreeNode(){}
        TreeNode(int val){
            this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
