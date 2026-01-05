//package Trees;
//
//public class Inorder_Traversal {
//
//
//    public class Solution {
//        public int[] inorderTraversal(TreeNode A) {
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
//            if (node == null) {
//                return;
//            }
//
//            treepreorder(node.left, result);
//            result.add(node.val);
//            treepreorder(node.right, result);
//        }
//    }
//}
//
