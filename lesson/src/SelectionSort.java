public class SelectionSort {
    public static void main(String[] args) {
        String[] arr3 = {"Hello","Luffy","Zoro","Shanks","Andrey","Wapor"};

        char[] arr2 ={'@','&','^','#'};

        float[] arr1 ={1.4f,7.8f,8.11f,9.1f,0.5f};

        int[] arr = {1,12,2,7};
        //output for int
        int[] result = SelectionSort(arr);
        outputResult(result);
        System.out.println("-----------");
        //output for float
        float[] result1 = SelectionSort(arr1);
        outputResult(result1);
        System.out.println("-----------");
        //output for char
        char[] result2 = SelectionSort(arr2);
        outputResult(result2);
        System.out.println("-----------");
        //output for String
        String[] result3 = SelectionSort(arr3);
        outputResult(result3);
    }
    //for Int
    static int[] SelectionSort(int[] arr) {
        int size = arr.length;
        
        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i = step+1; i < size ; i++) {
                if(arr[i] < arr[min_idx]){
                    min_idx = i;
                }
            }
            int temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;
    }
    static void outputResult(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //for float
    static float[] SelectionSort(float[] arr) {
        float size = arr.length;

        for (float step = 0; step < size - 1; step++) {
            float min_idx = step;
            for (float i = step+1; i < size ; i++) {
                if(arr[(int) i] < arr[(int) min_idx]){
                    min_idx = i;
                }
            }
            float temp = arr[(int) step];
            arr[(int) step] = arr[(int) min_idx];
            arr[(int) min_idx] = temp;
        }
        return arr;
    }
    static void outputResult(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //for char
    static char[] SelectionSort(char[] arr) {
        char size = (char) arr.length;

        for (char step = 0; step < size - 1; step++) {
            char min_idx = step;
            for (char i = (char) (step+1); i < size ; i++) {
                if(arr[(int) i] < arr[(int) min_idx]){
                    min_idx = i;
                }
            }
            char temp = arr[(int) step];
            arr[(int) step] = arr[(int) min_idx];
            arr[(int) min_idx] = temp;
        }
        return arr;
    }
    static void outputResult(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //for String
    static String[] SelectionSort(String[] arr) {
        int size = arr.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i =step+1; i < size ; i++) {
                if(arr[i].compareTo(arr[min_idx])<0){
                    min_idx = i;
                }
            }
            String temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;
    }
    static void outputResult(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
