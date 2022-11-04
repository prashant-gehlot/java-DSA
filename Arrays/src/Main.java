public class Main {
    public static void main(String[] args) {

        // Syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 numbers:

        int[] roll_no = new int[4];
        //or directly
        int[] roll_nos = {24, 1 ,2, 5, 6, 29, 39, 23};


        int ros[]; //this is the declaration of the array. ros is getting defined in stack.
        ros = new int[10]; //initialization: actually here the object is being created in the memory(heap).


        System.out.print(ros[0]); // output: 0


        String arr[] = new String[5];
        System.out.print(arr[0]); // output: null
    }
}