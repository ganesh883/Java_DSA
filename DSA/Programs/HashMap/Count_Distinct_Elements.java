package HashMap;

import java.util.HashSet;

public class Count_Distinct_Elements {
    public class Solution {
        public int solve(int[] A) {
            int n = A.length;

            HashSet<Integer> hs = new HashSet<>();

            for(int i=0;i<A.length;i++){
                hs.add(A[i]);
            }

            return hs.size();
        }
    }

}
