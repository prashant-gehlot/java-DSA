package src;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {29,36,69,328,75,-82,94,-57,93};
        int target = -82;
        System.out.println(LinearSearch(nums,target,2,6));

    }
    static int LinearSearch(int[] arr, int target, int start , int end){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop.
        for (int index = start; index < end ; index++) {
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
