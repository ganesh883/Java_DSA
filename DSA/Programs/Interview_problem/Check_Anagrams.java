package Interview_problem;

import java.util.Arrays;

public class Check_Anagrams {
    public static void main(String[] args) {

        String one = "hello";
        String two = "olleh";

        char[] arr1 = one.toCharArray();
        char[] arr2 = two.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int flag=0;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("Not an Anagram");
                flag=1;
                break;
            }
        }

        if(flag==0){
            System.out.print("It is an Anagram");
        }
    }
}
