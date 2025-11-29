package Interview_problem;

import java.util.ArrayList;
import java.util.HashSet;

public class Colorfull_Number {
    public static void main(String[] args) {

        int num = 23;

        ArrayList<Integer> number = new ArrayList<>();

        while(num>0){
            number.add(num%10);
            num=num/10;
        }

        int product = 0;
        int flag =0;
        HashSet<Integer> hs = new HashSet<>();


        for(int i=0;i<number.size();i++){
            product=1;
            for(int j=i;j<number.size();j++){
                product=product*number.get(j);
                if(hs.contains(product)){
                    flag=1;
                }
                else{
                    hs.add(product);
                }
            }
        }

        if(flag==0){
            System.out.println("It is a Colorful Number");
        }
    }
}
