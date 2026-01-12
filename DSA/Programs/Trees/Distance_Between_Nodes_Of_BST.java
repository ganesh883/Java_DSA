package Trees;

public class Distance_Between_Nodes_Of_BST {
//    public class Solution {
//
//        public int solve(TreeNode A, int B, int C) {
//
//            TreeNode lca = LCA(A, B, C);
//
//            int first = findDistance(lca, B);
//            int second = findDistance(lca, C);
//
//            return first + second;
//        }
//
//        private TreeNode LCA(TreeNode A, int B, int C){
//            while(A != null){
//                if(A.val > B && A.val > C)
//                    A = A.left;
//                else if(A.val < B && A.val < C)
//                    A = A.right;
//                else
//                    return A; // This is the LCA
//            }
//            return null;
//        }
//
//        private int findDistance(TreeNode A, int value){
//            int dist = 0;
//            while(A.val != value){
//                if(value < A.val)
//                    A = A.left;
//                else
//                    A = A.right;
//                dist++;
//            }
//            return dist;
//        }
//    }

}
