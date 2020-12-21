public class Sorts {
    /**
     * Bubble sort of an int array.
     * 
     * @postcondition The array will be modified such that the elements will be in
     *                increasing order.
     * @param data the elements to be sorted.
     */
    public static void bubbleSort(int[] data) {
        int len = data.length;
        boolean swapped = true;
        int swap;

        for (int i = 0; i < len && swapped; i++) {
            swapped = false;
            for (int j = 0; j < len - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = swap;

                    swapped = true;
                }
            }
        }
    }

    /**
     * selection sort of an int array.
     * 
     * @postcondition The array will be modified such that the elements will be in
     *                increasing order.
     * @param data - the elements to be sorted.
     */
    public static void selectionSort(int[] data) {
        int len = data.length;
        int min;
        int swap;

        for (int i = 0; i < len; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            swap = data[i];
            data[i] = data[min];
            data[min] = swap;
        }
    }

    /**
     * insertion sort of an int array.
     * 
     * @postcondition The array will be modified such that the elements will be in
     *                increasing order.
     * @param data - the elements to be sorted.
     */
    public static void insertionSort(int[] data) {
        int len = data.length;
        int swap;

        for (int i = 1; i < len; i++) {
            int j = i;
            while (j > 0 && data[j] < data[j - 1]) {
                swap = data[j];
                data[j] = data[j - 1];
                data[j - 1] = swap;
                j--;
            }
        }
    }
}