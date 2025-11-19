package Functions;

public class Perfect_Square {
    public static void main(String[] args) {

        int n = 25;
        int flag =0;


        int num =1;

        while(num*num <= n){
            if(num*num == n){
                System.out.print("It is a perfect Square");
                flag=1;
                break;
            }
            num++;
        }

        if(flag==0){
            System.out.print("It is not a perfect square");
        }
    }
}
