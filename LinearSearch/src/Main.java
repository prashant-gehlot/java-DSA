package src;

public class Main {

    public static void main(String[] args) {

        int[] nums = {2,39,29,292,39,-29,58,40,265,49,395,27,493,24,5,45};
        int target = -29;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1;
    static int LinearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop.
        for (int index = 0; index < arr.length ; index++) {
            //check for the element = target.
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // now no element is found then
        return -1;
    }
}
