public class BubbleSort {

    public static int[] bubbleSort(int[] array, String order) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (order == "asc") {
                    if (array[j] > array[j + 1]) {
                        // Swap 
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }

                } else if (order == "desc") {
                    if (array[j] < array[j + 1]) {
                        // Swap 
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }

                } 
            }
        }
        return array;
    }
}
