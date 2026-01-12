package Trees;

public class Sum_Binary_Tree_Or_Not {
    //public class Solution {
//
//        boolean isSumTree = true;  // start as true
//        public int solve(TreeNode A) {
//            sum(A);
//            return isSumTree ? 1 : 0;
//        }
////
//        private int sum(TreeNode A){
//            if(A == null) return 0;
//
//            // Leaf node
//            if(A.left == null && A.right == null) {
//                return A.val;
//            }
//
//            int left = sum(A.left);
//            int right = sum(A.right);
//
//            // Check SumTree condition
//            if(A.val != left + right) {
//                isSumTree = false;
//            }
//
//            // Return total sum of this subtree
//            return A.val + left + right;
//        }
//    }

}
