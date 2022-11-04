import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // ARRAY OF PRIMITIVES.
        int arr[] = new int[7];

        for (int i = 0; i <arr.length; i++) {
            //taking input
            arr[i] = in.nextInt();
        }

        for (int i = 0; i <arr.length; i++) {
            //printing the output.
            System.out.print(arr[i] +" ");
        }

        // Enhanced for loop
        for (int j : arr) {
            //printing the output.
            System.out.print(j + " ");
        }

        //one more way to print.
        System.out.print(Arrays.toString(arr));  //best one


    }
}
