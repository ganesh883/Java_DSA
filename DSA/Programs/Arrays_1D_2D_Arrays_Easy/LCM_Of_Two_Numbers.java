package Arrays_1D_2D_Arrays_Easy;

public class LCM_Of_Two_Numbers {
    public static void main(String[] args) {

        int a = 12;
        int b = 24;

        int min = Math.min(a,b);

        for(int i=min ; i<=a*b;i++){
            if(i%a==0 && i%b==0){
                System.out.print(i);
                break;
            }
        }
    }
}
