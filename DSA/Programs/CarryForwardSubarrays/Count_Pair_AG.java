package CarryForwardSubarrays;

public class Count_Pair_AG {
    public static void main(String[] args) {

        String name = "ABCGAG";
        int n = name.length();

        //two for loop and find AG Pair -> TC -> O(n2) SC -> O(1)

        //optimized -> Carry forward from last -> TC O(n) SC O(1)

        int countOfLetter =0;
        int countOfPairs = 0;

        for(int i=n-1;i>=0;i--){
            if(name.charAt(i)=='G'){
                countOfLetter++;
            }

            if(name.charAt(i)=='A'){
                countOfPairs+=countOfLetter;
            }
        }

        System.out.println(countOfPairs);
    }
}
