package Patterns;

public class Row_Space_Reverse_Patterns {
    public static void main(String[] args) {
        int n = 3;

        for(int i=0;i<n;i++){
            System.out.print("*");
            for(int j=0;j<n-i;j++){
                System.out.print("-");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
