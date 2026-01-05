package Trees;

public class Construct_a_Binary_Tree_From_Inorder_preorder {


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

            return constructBinaryTree(A,B,0,n-1,0,m-1);
        }

        public TreeNode constructBinaryTree(int[] pre, int[] in, int ps, int pen, int ins, int ine){
            if(ps>pen || ins>ine){
                return null;
            }

            TreeNode node = new TreeNode(pre[ps]);

            int index=0;
            for(int i=ins;i<=ine;i++){
                if(pre[ps]==in[i]){
                    index=i;
                    break;
                }
            }

            int count = Math.abs(ins-index);

            node.left = constructBinaryTree(pre,in,ps+1,ps+count,ins,index-1);

            node.right = constructBinaryTree(pre,in,ps+count+1,pen,index+1,ine);

            return node;
        }
    }

}
