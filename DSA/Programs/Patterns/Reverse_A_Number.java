package Patterns;

public class Reverse_A_Number {
    public static void main(String[] args) {
        int n = 12345;

        int ans = 0;

        while(n>0){
            int num = n%10;
            ans = ans*10+num;
            n=n/10;
        }

        System.out.print(ans);
    }
}
