import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 4, 2, 8, 11, 15};

        //! Q1 =========================================================
        System.out.println("Q1");
        // Sorting asc
        int sortedArrayAsc[] = BubbleSort.bubbleSort(array, "asc");
        System.out.print("Sorted array in ascending order: ");
        for (int i = 0; i <sortedArrayAsc.length; i++) {
            System.out.print(sortedArrayAsc[i] + " ");
        }
        System.out.println();

        // Sorting desc
        int[] sortedArrayDesc = BubbleSort.bubbleSort(array, "desc");
        System.out.print("Sorted array in descending order: ");
        for (int i = 0; i <sortedArrayDesc.length; i++) {
            System.out.print(sortedArrayDesc[i] + " ");
        }
        System.out.println("\n");

        //! Q2 =========================================================
        System.out.println("Q2");
        int[] array1 = {3, 6, 2, 4};
        int value1 = 4;

        int sortedArray1[] = BubbleSort.bubbleSort(array1, "asc");
        int index1 = BinarySearch.binarySearch(array1, value1);

        System.out.print("Sorted array: [");
        for (int i = 0; i < sortedArray1.length; i++) {
            System.out.print(sortedArray1[i] + " ");
        }

        System.out.println("] Index of " + value1 + " in sorted array: " + index1);

        int[] array2 = {1, 5, 8, 9, 10};
        int value2 = 5;

        int sortedArray2[] = BubbleSort.bubbleSort(array2, "asc");
        int index2 = BinarySearch.binarySearch(array2, value2);
        
        System.out.print("Sorted array: [");
        for (int i = 0; i < sortedArray2.length; i++) {
            System.out.print(sortedArray2[i] + " ");
        }
        
        System.out.println("] Index of " + value2 + " in sorted array: " + index2);
        System.out.println();

        //! Q3 =========================================================
        System.out.println("Q3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Text: (press 'Return' to mark end of input)");

        String input = scanner.nextLine();
        System.out.println();
        scanner.close();

        TextAnalysis.textAnalysis(input);


    }
}
