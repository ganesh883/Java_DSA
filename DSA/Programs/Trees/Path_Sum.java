package Trees;

public class Path_Sum {
    /**
     * Definition for binary tree
     * class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) {
     *      val = x;
     *      left=null;
     *      right=null;
     *     }
     * }
     */
//    public class Solution {
//        public int hasPathSum(TreeNode A, int B) {
//            if(A==null) return 0;
//
//            if(A.left==null && A.right==null){
//                if(A.val == B){
//                    return 1;
//                }
//            }
//
//            int left = hasPathSum(A.left,B-A.val);
//            int right = hasPathSum(A.right,B-A.val);
//
//
//            return (left==1 || right==1) ? 1 : 0;
//        }
//    }

}
