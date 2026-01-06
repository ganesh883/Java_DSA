///**
// * Definition for binary tree
// * class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int x) {
// *      val = x;
// *      left=null;
// *      right=null;
// *     }
// * }
// */
//public class Solution {
//    public int isBalanced(TreeNode A) {
//
//        return checkBalanced(A) == -1 ? 0 : 1;
//    }
//
//    public int checkBalanced(TreeNode A){
//        if(A == null){
//            return 0;
//        }
//
//        int leftheight = checkBalanced(A.left);
//        if(leftheight==-1) return -1;
//
//        int rightheight = checkBalanced(A.right);
//        if(rightheight==-1) return -1;
//
//        if (Math.abs(leftheight - rightheight) > 1) {
//            return -1;
//        }
//
//        return 1+Math.max(leftheight,rightheight);
//
//    }
//}
