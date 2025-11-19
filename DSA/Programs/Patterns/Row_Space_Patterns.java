package Patterns;

public class Row_Space_Patterns {
    public static void main(String[] args) {
        int n = 3;

        for(int i=0;i<n;i++){
            System.out.print("*");

            for(int j=0;j<n-1;j++){
                System.out.print("-");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
