//package Queue;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class N_Integers_Containing_1_2_3 {
//    public class Solution {
//        public int[] solve(int A) {
//            ArrayList<Integer> ans = new ArrayList<>();
//            Queue<Integer> q = new LinkedList<>();
//
//
//            q.add(1);
//            q.add(2);
//            q.add(3);
//
//            for(int i=0;i<A;i++){
//                int num = q.poll();
//                ans.add(num);
//
//                q.add(num*10+1);
//                q.add(num*10+2);
//                q.add(num*10+3);
//            }
//
//            return ans.toArray();
//
//        }
//    }
//
//}
