package HashMap;

import java.util.HashMap;

public class First_Repeating_Element {
    public class Solution {
        public int solve(int[] A) {

            HashMap<Integer,Integer> hm = new HashMap<>();

            for(int i=0;i<A.length;i++){
                if(hm.containsKey(A[i])){
                    hm.put(A[i],hm.get(A[i])+1);
                }
                else{
                    hm.put(A[i],1);
                }
            }


            for(int i=0;i<A.length;i++){
                if(hm.get(A[i])!=1){
                    return A[i];
                }
            }
            return -1;
        }
    }

}
