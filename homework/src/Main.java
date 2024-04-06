public class Main {

    public static void main(String[] args) {
        Song song = new Song();
        song.setSong1("song 1:");
        song.setTime1(334);
        song.setSong2("song 2:");
        song.setTime2(120);
        song.setSong3("song 3:");
        song.setTime3(230);
        song.setSong4("song 4:");
        song.setTime4(510);


        System.out.println(song.getSong1()+" "+song.getTime1()+"\n"+song.getSong2()+" "+song.getTime2()+"\n"+song.getSong3()+" "+song.getTime3()+"\n"+song.getSong4()+" "+song.getTime4());
        System.out.println("-----------");
        //time
        int a = song.getTime1();
        int a2 = song.getTime2();
        int a3 = song.getTime3();
        int a4 = song.getTime4();
        int[] arr ={a,a2,a3,a4};

        int[] counts = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            counts[i] = count(arr[i]);
            System.out.println(arr[i]+": "+counts[i]);
        }

        System.out.println("-----------");
        int[] result = quickSort(arr,0,arr.length-1);
        outputResult(result);

    }
    static int count(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 10 == 1) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    static int[] quickSort(int[] arr, int start, int end){
        if(start<end){
            int pi = partition(arr,start,end);
            quickSort(arr,start,pi-1);
            quickSort(arr,pi+1,end);
        }
        return arr;
    }

    static int partition(int[] arr, int start, int end) {
        int s = (start+end)/ 2;
        int pivot = count(arr[end]);
        int i = start - 1;

        int[] counts = new int[arr.length];
        for (int x = 0; x < arr.length; x++) {
            counts[x] = count(arr[x]);
        }

        for (int j = start; j < end; j++) {
            if (counts[j] < pivot || (counts[j] == pivot && arr[j] < arr[end])) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                int tempCount = counts[i];
                counts[i] = counts[j];
                counts[j] = tempCount;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        int tempCount = counts[i + 1];
        counts[i + 1] = counts[end];
        counts[end] = tempCount;

        return (i + 1);
    }


    static void outputResult(int[] arr){
        int i = 0;
        while (i < arr.length && count(arr[i]) > 0) {
            System.out.println(arr[i]);
            i++;
        }
        for (int j = i; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        }
    }
