package LeetCode75.Arrays_Strings;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_The_Greatest_Number_Of_Candies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            ArrayList<Boolean> ans = new ArrayList<>();

            int max = Integer.MIN_VALUE;

            for(int i=0;i<candies.length;i++){
                max=Math.max(candies[i],max);
            }


            for(int i=0;i<candies.length;i++){
                if(candies[i]+extraCandies >= max){
                    ans.add(true);
                }
                else{
                    ans.add(false);
                }
            }
            return ans;
        }
    }
}
