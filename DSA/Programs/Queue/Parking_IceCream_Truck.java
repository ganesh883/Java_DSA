package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parking_IceCream_Truck {
    public class Solution {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int[] slidingMaximum(final int[] A, int B) {
            int n = A.length;
            int ans[] = new int[n-B+1];
            Deque<Integer> dq = new ArrayDeque<>();

            for(int i=0;i<B;i++){
                while(!dq.isEmpty() && A[i]>dq.getLast()){
                    dq.removeLast();
                }
                dq.addLast(A[i]);
            }
            ans[0]=dq.getFirst();

            int s=1;
            int e=B;

            while(e<n){

                if(!dq.isEmpty() && dq.getFirst()==A[s-1]){
                    dq.removeFirst();
                }

                while(!dq.isEmpty() && A[e]>dq.getLast()){
                    dq.removeLast();
                }
                dq.addLast(A[e]);
                ans[s]=dq.getFirst();

                s++;
                e++;
            }

            return ans;
        }
    }

}
