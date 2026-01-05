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
//public class postorder_traversal {
//
//
//
//    public class Solution {
//        public int[] postorderTraversal(TreeNode A) {
//            List<Integer> result = new ArrayList<>();
//            treepreorder(A, result);
//
//
//            int[] array = new int[result.size()];
//            for (int i = 0; i < result.size(); i++) {
//                array[i] = result.get(i);
//            }
//            return array;
//        }
//
//        private void treepreorder(TreeNode node, List<Integer> result) {
//            if(node == null) {
//                return;
//            }
//
//            treepreorder(node.left, result);
//            treepreorder(node.right, result);
//            result.add(node.val);
//        }
//    }
//}
