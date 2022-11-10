package src;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {29,36,69,328,75,-82,94,-57,93};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int minElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minElement >= arr[i]){
                minElement = arr[i];
            }
        }
        return minElement;
    }
}
