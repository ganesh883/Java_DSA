package HashMap;

import java.util.HashMap;

public class Frequency_Of_element_query {
    public class Solution {
        public int[] solve(int[] A, int[] B) {

            HashMap<Integer, Integer> hm = new HashMap<>();

            for(int i=0;i<A.length;i++){
                if(hm.containsKey(A[i])){
                    hm.put(A[i],hm.get(A[i])+1);
                }
                else{
                    hm.put(A[i],1);
                }
            }

            int[] ans = new int[B.length];

            for(int i=0;i<ans.length;i++){
                int val = B[i];
                if(hm.containsKey(val)){
                    ans[i]=hm.get(val);
                }
                else{
                    ans[i]=0;
                }
            }

            return ans;
        }
    }

}
