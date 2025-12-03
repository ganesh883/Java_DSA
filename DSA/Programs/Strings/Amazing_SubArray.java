package Strings;

public class Amazing_SubArray {
    public static void main(String[] args) {

        String s = "ABEC";
        int n = s.length();

        int count=0;

        for(int i=0;i<n;i++){
            if(isVowel(s.charAt(i))){
                count=count+(n-i);
            }

        }
        System.out.println(count);
    }

    public static boolean isVowel(char a){
        return "AEIOUaeiou".indexOf(a) !=-1;
    }
}
