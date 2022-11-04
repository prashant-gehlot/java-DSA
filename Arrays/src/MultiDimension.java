import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*

            1 2 3
            4 5 6
            7 8 9

         */
        // int[][] arr = new int[3][];  defining column is more important.

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] arr2 = {
                {1,2,3},    //0th index
                {4,5},      //1st index
                {6,7,8,9}   //2nd index -> arr2[2] = {6,7,8,9}
        };

        int[][] arr101 = new int[3][3];
        System.out.println(arr101.length);  //no of rows.

        //input
        for (int i = 0; i < arr101.length ; i++) {
            //for each col in every row
            for (int j = 0; j < arr101[i].length ; j++) {
                arr101[i][j] = in.nextInt();
            }
        }

        //output
        for (int i = 0; i < arr101.length ; i++) {
            //for each col in every row
            for (int j = 0; j < arr101[i].length ; j++) {
                System.out.print(arr101[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced output for 2d array.
        for (int i = 0; i < arr101.length ; i++) {
            System.out.println(Arrays.toString(arr101[i]));
        }
    }
}
