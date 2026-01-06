//import java.util.*;
//public class Solution {
//    static class Pair {
//        TreeNode node;
//        int hd;
//
//        Pair(TreeNode node, int hd) {
//            this.node = node;
//            this.hd = hd;
//        }
//    }
//
//    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
//
//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        if (A == null) return result;
//        // HD -> list of node values
//        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
//        Queue<Pair> queue = new LinkedList<>();
//
//        queue.offer(new Pair(A, 0));
//
//        while (!queue.isEmpty()) {
//            Pair curr = queue.poll();
//            TreeNode node = curr.node;
//            int hd = curr.hd;
//
//            map.putIfAbsent(hd, new ArrayList<>());
//            map.get(hd).add(node.val);
//
//            if (node.left != null)
//                queue.offer(new Pair(node.left, hd - 1));
//
//            if (node.right != null)
//                queue.offer(new Pair(node.right, hd + 1));
//        }
//        // Collect result
//        for (ArrayList<Integer> col : map.values()) {
//            result.add(col);
//        }
//        return result;
//    }
//}
