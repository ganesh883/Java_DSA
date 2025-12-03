package Strings;

public class Longest_Common_Prefix {
    public static void main(String[] args) {

        String[] arr = {"abcdefgh", "abefghik", "abcefgh"};

        String ans = arr[0];

        for(int i=1;i<arr.length;i++){
            ans = check(ans,arr[i]);
        }

        System.out.println(ans);
    }

    public static String check(String one, String two){

        String ans = "";

        int min = Math.min(one.length(),two.length());

        for(int i=0;i<min;i++){
            if(one.charAt(i)==two.charAt(i)){
                ans+=one.charAt(i);
            }
        }

        return ans;
    }
}
