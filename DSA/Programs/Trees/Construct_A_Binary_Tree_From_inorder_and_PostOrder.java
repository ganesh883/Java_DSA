package Trees;

import javax.swing.tree.TreeNode;

public class Construct_A_Binary_Tree_From_inorder_and_PostOrder {


      class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) {
           val = x;
           left=null;
           right=null;
         }
      }

    public class Solution {
        public TreeNode buildTree(int[] A, int[] B) {
            int n = A.length;
            int m = B.length;

            return constructBinarytree(A,B,0,n-1,0,m-1);
        }


        public TreeNode constructBinarytree(int[] in, int[] post, int is, int ie, int ps, int pe){

            if(ps>pe || is>ie){
                return null;
            }

            TreeNode node = new TreeNode(post[pe]);

            int index=0;
            for(int i=is;i<=ie;i++){
                if(post[pe]==in[i]){
                    index=i;
                    break;
                }
            }

            int count = Math.abs(index-is);

            node.left = constructBinarytree(in, post, is,index-1,ps,ps+count-1);

            node.right = constructBinarytree(in, post,index+1,ie,ps+count,pe-1);

            return node;
        }
    }

}
