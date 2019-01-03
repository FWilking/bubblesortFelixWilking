package FelixWilking;

public class Main {

    public static void main(String[] args) {
        long time = System.nanoTime();
        int[] arr = randIntArr(10000, 10000);
        for(int i : bubbleSort(arr)){
            System.out.print(i + " ");
        }
        System.out.println("\n" + (System.nanoTime() - time));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] randIntArr(int len, int range){
        int[] output = new int[len];
        for (int i = 0; i < len; i++){
            output[i] = (int) (Math.random() * (range + 1));
        }
        return output;
    }

    public static int[] bubbleSort(int[] arr){
        int[] output = arr;
        boolean sorted = false;
        for (int num:output){
            num = (int) (Math.random() * output.length);
        }
        while (!sorted){
            sorted = true;
            for (int i = 0; i < output.length - 1; i++){
                if (output[i] > output[i + 1]){
                    swap(output, i, i + 1);
                    sorted = false;
                }
            }
        }
        return output;
    }
}

