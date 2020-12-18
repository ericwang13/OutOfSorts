import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Tester {
    public static void main(String[] args) {
        int[] standardArr = new int[13];
        randomArr(standardArr, 1989);
        int[] sortedArr = Arrays.copyOf(standardArr, 13);
        Arrays.sort(sortedArr);
        int[] emptyArr = new int[0];
        int[] zeroArr = { 0, 0, 0, 0, 0, 0, 0 };

        printArr(standardArr);
        Sorts.bubbleSort(standardArr);
        printArr(standardArr);
        System.out.println("----------------------------");

        printArr(sortedArr);
        Sorts.bubbleSort(sortedArr);
        printArr(sortedArr);
        System.out.println("----------------------------");

        printArr(emptyArr);
        Sorts.bubbleSort(emptyArr);
        printArr(emptyArr);
        System.out.println("----------------------------");

        printArr(zeroArr);
        Sorts.bubbleSort(zeroArr);
        printArr(zeroArr);
        System.out.println("----------------------------");
    }

    public static void randomArr(int[] data, int seed) {
        Random rng = new Random(seed);
        for (int i = 0; i < data.length; i++) {
            data[i] = rng.nextInt() % 100;
        }
    }

    public static void printArr(int[] data) {
        System.out.print("[");
        for (int i : data) {
            System.out.print(" " + i + " ");
        }
        System.out.println("]");
    }
}