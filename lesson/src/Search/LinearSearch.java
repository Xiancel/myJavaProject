package Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr = {1,4,5,9,4,11,34};
        int numberToFind = 4;
        int result = linearSearch(arr, numberToFind);
        System.out.println(result);
    }

    private static int linearSearch(int[] arr, int numberToFind) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == numberToFind){
                return i;
            }
        }
        return -1;
    }
}
