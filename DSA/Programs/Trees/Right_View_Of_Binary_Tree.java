//package Trees;
//
//public class Right_View_Of_Binary_Tree {
//    /**
//     * Definition for binary tree
//     * class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode(int x) {
//     *      val = x;
//     *      left=null;
//     *      right=null;
//     *     }
//     * }
//     */
//    public class Solution {
//        public ArrayList<Integer> solve(TreeNode A) {
//            ArrayList<Integer> ans = new ArrayList<>();
//
//            return rightViewofTree(A,ans);
//        }
//
//        public static ArrayList<Integer> rightViewofTree(TreeNode A, ArrayList<Integer> ans){
//            Queue<TreeNode> dq = new ArrayDeque<>();
//
//            TreeNode last_node = null;
//
//            dq.add(A);
//
//            while(!dq.isEmpty()){
//                int dqsize = dq.size();
//                for(int i=0;i<dqsize;i++){
//                    TreeNode rem = dq.remove();
//                    last_node=rem;
//                    if(rem.left!=null){
//                        dq.add(rem.left);
//                    }
//
//                    if(rem.right!=null){
//                        dq.add(rem.right);
//                    }
//                }
//                ans.add(last_node.val);
//            }
//
//            return ans;
//        }
//    }
//
//}
