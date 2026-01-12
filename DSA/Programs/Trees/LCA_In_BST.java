package Trees;

public class LCA_In_BST {
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
    /**public class Solution {
        public int solve(TreeNode A, int B, int C) {

            while(A!=null){

                if(A.val>B && A.val>C){
                    A=A.left;
                }
                else if(A.val<B && A.val<C){
                    A=A.right;
                }
                else{
                    return A.val;
                }
            }
            return 0;
        }**/


}
