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
        int swap;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = swap;
                }
            }
        }
    }
}