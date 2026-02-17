package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Reversing_Elements_In_Queu {
    public class Solution {
        public int[] solve(int[] A, int B) {
            int n = A.length;
            Deque<Integer> ans = new ArrayDeque<>();

            for(int i=B-1;i>=0;i--){
                ans.addLast(A[i]);
            }

            for(int i=B;i<n;i++){
                ans.addLast(A[i]);
            }

            int[] anser = new int[n];

            for(int i=0;i<n;i++){
                anser[i]=ans.getFirst();
                ans.removeFirst();
            }

            return anser;
        }

    }

}
