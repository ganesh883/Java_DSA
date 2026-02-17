package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Perfect_Numbers {
    public class Solution {
        public String solve(int A) {

            Queue<String> dq = new LinkedList<>();

            dq.add("1");
            dq.add("2");

            for(int i=1;i<A;i++){
                String ele = dq.peek();
                dq.offer(ele+"1");
                dq.offer(ele+"2");
                dq.poll();
            }

            StringBuilder sb = new StringBuilder(dq.peek());
            sb.reverse();
            String ans = dq.poll()+sb;
            return ans;
        }
    }

}
