package Strings;

public class Longest_Palindromic_Length {
    public static void main(String[] args) {
        String name = "adaebcdfdcbetggte";
        int n = name.length();

        int ans = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int p1=i;
            int p2=i;

            ans = Math.max(ans,CheckPalindrome(name,p1,p2));
        }

        for(int i=0;i<n;i++){
            int p1=i;
            int p2=i+1;
            ans = Math.max(ans,CheckPalindrome(name,p1,p2));
        }

        System.out.println(ans);
    }

    public static int CheckPalindrome(String name, int p1, int p2){
        while(p1>=0 && p2<name.length() && name.charAt(p1)==name.charAt(p2)){
            p1--;
            p2++;
        }

        return p2-p1-1;
    }
}
