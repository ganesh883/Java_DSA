package Arrays_1D_2D_Arrays_Easy;

import java.util.ArrayList;

public class Add_One_To_Number {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);

        int carry=1;
        for(int i=num.size()-1;i>=0;i--){
            int ans = num.get(i)+carry;
            carry=ans%10;
            num.set(i,ans);
        }

        if(carry>0){
            num.set(0,carry);
        }
    }
}
