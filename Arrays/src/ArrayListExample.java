// ArrayList is dynamic array.
// Similar to the vectors<> in CPP.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList(4);

        list.add(24);
        list.add(58);
        list.add(11);
        list.add(30);
        list.add(4);   // you can add more the capacity.

        // printing.
        System.out.println(list);

        //checking.
        System.out.println(list.contains(4)); //true

        // update.
        list.set(1, 49);    // (index, value)
        System.out.print(list);

        // remove.
        list.remove(2);

        // input.
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
    }
}
