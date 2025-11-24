package LeetCode75.Arrays_Strings;

public class Reverse_words_In_A_String {
    class Solution {
        public String reverseWords(String s) {

            String[] arr = s.split(" ");

            StringBuilder ans = new StringBuilder();

            for(int i=arr.length-1;i>=0;i--){
                if(!arr[i].isEmpty()){
                    ans.append(arr[i]);
                    ans.append(" ");
                }

            }

            return ans.toString().trim();

        }
    }
}
