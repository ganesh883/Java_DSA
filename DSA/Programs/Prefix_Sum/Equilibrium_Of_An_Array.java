package Prefix_Sum;

public class Equilibrium_Of_An_Array {
    public static void main(String[] args) {

        int[] arr = {-7,1,5,2,-4,3,0};
        int n = arr.length;

        int[] psum = new int[n];

        psum[0]=arr[0];
        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]+arr[i];
        }

        int lower=0;
        int higher=0;
        int equilibrium =Integer.MAX_VALUE;
        int flag=0;

        for(int i=0;i<n;i++){
            if(i==0){
                lower=0;
                higher=psum[n-1]-psum[i];
            }
            else if (i==n-1){
                higher=0;
                lower=psum[i-1];
            }
            else{
                lower = psum[i-1];
                higher = psum[n-1]-psum[i];
            }

            if(lower==higher){
                System.out.println(i+" ");
                equilibrium=Math.min(equilibrium,i);
                flag=1;
            }
        }

        if(flag==0){
            System.out.println(-1);
        }
        else{
            System.out.println(equilibrium);
        }
    }
}
// Tc-> O(n) SC - > O(n)