package Strings;

public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        String name = "adaebcdfdcbetggte";

        String ans = longestPalindrome(name);
        System.out.println(ans);   // prints the longest palindromic substring
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s;

        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            // Odd length case (center at i)
            int len1 = expand(s, i, i);
            if (len1 > maxLen) {
                maxLen = len1;
                start = i - (len1 / 2);
            }

            // Even length case (center between i and i+1)
            int len2 = expand(s, i, i + 1);
            if (len2 > maxLen) {
                maxLen = len2;
                start = i - (len2 / 2) + 1;
            }
        }

        return s.substring(start, start + maxLen);
    }

    public static int expand(String s, int p1, int p2) {
        while (p1 >= 0 && p2 < s.length() && s.charAt(p1) == s.charAt(p2)) {
            p1--;
            p2++;
        }
        return p2 - p1 - 1; // length of palindrome
    }
}
