public class BubbleSort {
    public static void main(String[] args) {
        String[] arr3 = {"Hello","Luffy","Zoro","Shanks","Andrey","Wapor"};

        char[] arr2 ={'@','&','^','#'};

        float[] arr1 ={1.4f,7.8f,8.11f,9.1f,0.5f};

        int[] arr ={1,12,2,7};

        //output for int
        int[] result = BubbleSort(arr);
        outputResult(result);
        System.out.println("----------");
        //output for float
        float[] result1 = BubbleSort(arr1);
        outputResult(result1);
        System.out.println("-------");
        //output for char
        char[] result2 = BubbleSort(arr2);
        outputResult(result2);
        System.out.println("-------");
        //output for String
        String[] result3 = BubbleSort(arr3);
        outputResult(result3);
    }
    //for int
    static int[] BubbleSort(int[] arr) {
        int size = arr.length;

        for (int step = 0; step < size - 1; step++) {
            for (int i = 0; i < size - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
    static void outputResult(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //for float
    static float[] BubbleSort(float[] arr) {
        float size = arr.length;

        for (float step = 0; step < size - 1; step++) {
            for (float i = 0; i < size - 1; i++) {
                if (arr[(int) i] > arr[(int) i + 1]) {
                    float temp = arr[(int)i];
                    arr[(int)i] = arr[(int)i + 1];
                    arr[(int)i + 1] = temp;
                }
            }
        }
        return arr;
    }
    static void outputResult(float[] arr) {
        for (float i = 0; i < arr.length; i++) {
            System.out.println(arr[(int) i]);
        }
    }
    //for char
    static char[] BubbleSort(char[] arr) {
        char size = (char) arr.length;

        for (char step = 0; step < size - 1; step++) {
            for (char i = 0; i < size - 1; i++) {
                if (arr[(int) i] > arr[(int) i + 1]) {
                    char temp = arr[(int) i];
                    arr[(int) i] = arr[(int) i + 1];
                    arr[(int) i + 1] = temp;
                }
            }
        }
        return arr;
    }
    static void outputResult(char[] arr) {
        for (char i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //for String
    static String[] BubbleSort(String[] arr) {
        int size = arr.length;

        for (int step = 0; step < size - 1; step++) {
            for (int i = 0; i < size - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) >0) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
    static void outputResult(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
