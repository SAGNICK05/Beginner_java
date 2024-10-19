import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        // Sorting both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Merging both sorted arrays
        int[] mergedArray = mergeSortedArrays(array1, array2);

        // Display the result
        System.out.println("The merged sorted array is: " + Arrays.toString(mergedArray));
        sc.close();
    }

    // Method to merge two sorted arrays
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge arrays
        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy remaining elements of array1
        while (i < n1) {
            mergedArray[k++] = array1[i++];
        }

        // Copy remaining elements of array2
        while (j < n2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}
