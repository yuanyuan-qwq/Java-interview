public class BinarySearch {

    public static int binarySearch(int[] array, int value) {
        // Sorting
        int[] sortedArray = BubbleSort.bubbleSort(array, "asc");
        
        // binary search
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sortedArray[mid] == value) {
                return mid;  
            }
            if (sortedArray[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;  // if value not found
    }
}
