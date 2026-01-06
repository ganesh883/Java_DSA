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
//    public ArrayList<Integer> solve(TreeNode A) {
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        queue.add(A);
//
//        while(!queue.isEmpty()){
//            TreeNode node = queue.remove();
//            list.add(node.val);
//            if(node.val != -1){
//                if(node.left == null)
//                    queue.add(new TreeNode(-1));
//                else
//                    queue.add(node.left);
//                if(node.right == null)
//                    queue.add(new TreeNode(-1));
//                else
//                    queue.add(node.right);
//            }
//        }
//        return list;
//    }
//}