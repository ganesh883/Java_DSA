package Functions;

public class Factorial {
    public static void main(String[] args) {

        int n = 5;

        int ans = 1;
//
//        while(n>0){
//            ans= n*ans;
//            n--;
//        }
//        System.out.println(ans);


        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        System.out.print(ans);
    }

}
