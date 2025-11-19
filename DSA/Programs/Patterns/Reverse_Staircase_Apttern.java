package Patterns;

public class Reverse_Staircase_Apttern {
    public static void main(String[] args) {

        int n = 5;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* " );
            }
            System.out.println();
        }
    }
}
