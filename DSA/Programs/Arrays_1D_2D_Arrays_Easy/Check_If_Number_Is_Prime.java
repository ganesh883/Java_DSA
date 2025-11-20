package Arrays_1D_2D_Arrays_Easy;

import java.util.Scanner;

public class Check_If_Number_Is_Prime {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(checkCount(n)==2){
            System.out.println("It is a Prime Number");
        }
        else{
            System.out.println("It is not a Prime Number");
        }
    }

    public static int checkCount(int n ){
        int count =0;

        for (int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }

        return count;
    }
}
