package Trees;

public class Equal_Tree_Partition {
//    import java.util.*;
//
//    public class Solution {
//
//        HashSet<Long> set = new HashSet<>();
//
//        public int solve(TreeNode A) {
//            long totalSum = subtreeSum(A);
//
//            // If total sum is odd, can't split
//            if (totalSum % 2 != 0) return 0;
//
//            // Remove full tree sum (root subtree)
//            set.remove(totalSum);
//
//            return set.contains(totalSum / 2) ? 1 : 0;
//        }
//
//        private long subtreeSum(TreeNode node) {
//            if (node == null) return 0;
//
//            long left = subtreeSum(node.left);
//            long right = subtreeSum(node.right);
//
//            long sum = left + right + node.val;
//
//            set.add(sum);
//            return sum;
//        }
//    }

}
