package FelixWilking;

public class Main {

    public static void main(String[] args) {
        int[] testarr = new int[10];
        boolean sorted = false;
        for (int num:testarr){
            num = (int) (Math.random() * testarr.length);
        }
        while (!sorted){
            sorted = true;
            for (int i = 0; i < testarr.length - 1; i++){
                if (testarr[i] > testarr[i + 1]){
                    swap(testarr, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
