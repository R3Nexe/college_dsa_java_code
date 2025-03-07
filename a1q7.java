package assignment1;

public class a1q7 {

    public static void main(String args[]) {
        int arr[] = {1, 1, 2, 3, 4, 5, 1, 6, 6, 7, 7};
        int max = arr[0];
        int min = arr[0];
        int countmax = 0;
        int countmin = 0;
        int maxindex = 0;
        int minindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                countmax++;
            }
            if (arr[i] == min) {
                countmin++;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                maxindex = i;
                break;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                minindex = i;
            }
        }
        System.out.println("the maximum is " + max + " and it occurs " + countmax + " times");
        System.out.println("the minimum is " + min + " and it occurs " + countmax + " times");
        System.out.println("first occurance of max: " + maxindex);
        System.out.println("last occurance of min: " + minindex);
    }
}
