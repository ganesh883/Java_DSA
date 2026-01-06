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
//    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
//
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//
//        return levelordertraversal(A, ans);
//    }
//
//    public static ArrayList<ArrayList<Integer>> levelordertraversal(TreeNode A, ArrayList<ArrayList<Integer>> ans){
//
//        Queue<TreeNode> dq = new ArrayDeque<>();
//
//        dq.add(A);
//
//        while(!dq.isEmpty()){
//            ArrayList<Integer> listone = new ArrayList<>();
//            int dqsize = dq.size();
//
//            for(int i=0;i<dqsize;i++){
//                TreeNode rem = dq.remove();
//                listone.add(rem.val);
//
//                if(rem.left!=null){
//                    dq.add(rem.left);
//                }
//
//                if(rem.right!=null){
//                    dq.add(rem.right);
//                }
//            }
//            ans.add(listone);
//        }
//        return ans;
//    }
//}
