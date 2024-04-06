public class QuickSort {
    public static void main(String[] args) {
        //создання массиву
        int[] arr = {14,5,1,7,9,3,2};
        //збереження результату в новий массив "result" і визов метода quickSort
        int[]result = quickSort(arr,0,arr.length-1);
        //виведення отсортурованого массиву
        outputResult(result);
    }

    //метод швидкого сортування
    private static int[] quickSort(int[] arr, int right, int left) {
        //проверка что правая граница массива меньше левой
        if(right<left){
            //визначення опорного елементу визовом метода partition
            int pivot = partition(arr,right,left);
            //рекурсія метода quickSort для лівої і правої частинни массива
            quickSort(arr,right,pivot-1);
            quickSort(arr,pivot+1,left);

        }
        //повернення відсортованного массиву
        return arr;
    }

    //метод  для определеннія опорного елементу масиву
    private static int partition(int[] arr, int right, int left) {
        //визначення опорного елементу, (він буде останній єлемент массиву)
        int pivot = arr[left];
        //встановдення начального значення і
        int i =(right-1);

        //проход по всім єлементам массива котрі находяться праворучь від опорного єлементу
        for (int j = right; j <left ; j++) {
            //перевірка якщо тікущию елемент меньше опорного
            if(arr[j]<pivot){
                //збільшення і на 1
                i++;
                //змінення місцямі текущий елемент з елементом под індексом і
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //змінненя місцяцмі опорний елемент з большім елементом ,це і
        int temp = arr[i+1];
        arr[i+1] = arr[left];
        arr[left] = temp;
        //повернення опорного елементу
        return (i+1);
    }
    //Метод який виводе массив в консоль
    public static void outputResult(int[] arr) {
        System.out.println("Ваш відсортурованний массив Пане");
        //цикл для ввиведення усіх елементів в консолі
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
