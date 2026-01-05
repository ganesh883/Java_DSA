//package Trees;
//
//import java.util.List;
//import java.util.ArrayList;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) {
//        val = x;
//        left=null;
//        right=null;
//    }
//}
//
//public class Preorder_Traversal {
//
//    public class Solution {
//        public ArrayList<Integer> preorderTraversal(TreeNode A) {
//            ArrayList<Integer> ans = new ArrayList<>();
//            findPreOrder(ans, A);
//            return ans;
//        }
//
//        public static void findPreOrder(ArrayList<Integer> ans, TreeNode A){
//            if(A==null){
//                return;
//            }
//            ans.add(A.val);
//            findPreOrder(ans,A.left);
//            findPreOrder(ans,A.right);
//
//
//        }
//    }
//
//}
