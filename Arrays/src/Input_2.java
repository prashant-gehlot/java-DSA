import java.util.Arrays;
import java.util.Scanner;

public class Input_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ARRAY OF OBJECTS.
        String[] str = new String[4];
        for (int i = 0; i <str.length; i++) {
            str[i] = in.next();
        }

        System.out.print(Arrays.toString(str));
    }
}
