package Arrays_1D_2D_Arrays_Easy;

import java.util.ArrayList;

public class ArrayList_2D_Even_Numbers_In_A_Row {
    public static void main(String[] args) {
        // Create a 2D ArrayList (ArrayList of ArrayList)
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Adding rows
        for (int i = 0; i < 3; i++) {  // 3 rows
            matrix.add(new ArrayList<>());
        }

        // Adding data to each row
        matrix.get(0).add(10);
        matrix.get(0).add(21);
        matrix.get(0).add(31);

        matrix.get(1).add(41);
        matrix.get(1).add(50);
        matrix.get(1).add(61);

        matrix.get(2).add(70);
        matrix.get(2).add(81);
        matrix.get(2).add(91);



        ArrayList<ArrayList<Integer>> FinalAns = new ArrayList<>();

        for(int i=0;i<matrix.size();i++){
            ArrayList<Integer> rowans = new ArrayList<>();
            for(int j=0;j<matrix.get(i).size();j++){
                if(matrix.get(i).get(j)%2==0){
                    rowans.add(matrix.get(i).get(j));
                }
            }
            FinalAns.add(rowans);
        }


        for(int i=0;i<FinalAns.size();i++){
            for(int j=0;j<FinalAns.get(i).size();j++) {
                System.out.print(FinalAns.get(i).get(j));
            }
            System.out.println();
        }
    }
}
