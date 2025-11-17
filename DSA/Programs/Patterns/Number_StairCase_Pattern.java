package Patterns;

public class Number_StairCase_Pattern {
    public static void main(String[] args) {
        int n = 5;

        int value=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(value+++" ");
            }
            System.out.println();
        }
    }
}
