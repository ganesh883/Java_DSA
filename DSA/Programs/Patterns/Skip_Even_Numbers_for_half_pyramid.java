package Patterns;

public class Skip_Even_Numbers_for_half_pyramid {
    public static void main(String[] args) {

        int n = 5;

        int value=1;

        for(int i=1;i<=n;i++){
            value=1;
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print("-");
                    value++;
                }
                else{
                    System.out.print(value++);
                }

            }
            System.out.println();
        }
    }
}
