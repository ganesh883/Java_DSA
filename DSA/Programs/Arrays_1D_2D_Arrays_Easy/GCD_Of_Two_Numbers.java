package Arrays_1D_2D_Arrays_Easy;

public class GCD_Of_Two_Numbers {
    public static void main(String[] args) {

        int a = 12;
        int b = 24;

        int max = Math.max(a,b);

        for(int i=max;i>=0;i--){
            if(a%i==0 && b%i==0){
                System.out.print(i);
                break;
            }
        }
    }
}
