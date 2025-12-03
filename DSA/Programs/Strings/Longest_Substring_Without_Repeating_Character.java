package Strings;

import java.util.Arrays;

public class Longest_Substring_Without_Repeating_Character {
    public static void main(String[] args) {

        String name = "abcdabcdebb";
        int n = name.length();

        int left=0;
        int max = 0;

        int[] charSeen = new int[128];

        Arrays.fill(charSeen, -1);

        for(int right=0;right<n;right++){
            char c = name.charAt(right);

            if(charSeen[c] >= left){
                left = charSeen[c]+1;
            }

            charSeen[c]=right;

            max=Math.max(max,right-left+1);
        }
       System.out.println(max);
    }
}
