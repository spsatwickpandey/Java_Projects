import java.util.*;

public class Quicksort {

    // This is our main quicksort method.
    public static void quickSort(int[] array, int start, int end) {
        // Base condition: if start is greater than or equal to end, the sub-array has 1 or 0 elements and is already sorted.
        if (start >= end) {
            return;
        }

        // Step 1: Partition the array and get the pivot index
        int pivotIndex = partition(array, start, end);

        // Step 2: Recursively sort the left side of the pivot
        quickSort(array, start, pivotIndex - 1);

        // Step 3: Recursively sort the right side of the pivot
        quickSort(array, pivotIndex + 1, end);
    }

    // This is the partition method that rearranges the array and returns the final pivot index.
    public static int partition(int[] array, int start, int end) {
        // We choose the last element as the pivot.
        int pivot = array[end];
        // 'i' will keep track of the "less than pivot" region.
        int i = start - 1;

        // Step through each element from 'start' to 'end - 1'.
        for (int j = start; j < end; j++) {
            // If current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;
                // Swap elements at 'i' and 'j' so that smaller elements are on the left.
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Place the pivot in its correct position by swapping with 'i + 1'.
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        // Return the pivot's index.
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number of values in Array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the Elements of Array: ");
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        quickSort(ar, 0, ar.length - 1);

        // Print the sorted array.
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }
}