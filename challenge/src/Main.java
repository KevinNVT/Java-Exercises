import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // First array
        int[] array = {5, 3, 8, 7, 10};
        // Get the array length
        int length = array.length;

        // Verify the array has at least two elements
        if (length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Get the smallest numbers (Handle negative numbers)
        int smallest1 = array[0]; // Smallest number
        int secondSmallest1 = array[1]; // Second smallest number
        // Get the largest numbers
        int largest1 = array[length - 1]; // Largest number
        int secondLargest1 = array[length - 2]; // Second largest number

        // Calculate the possible products for the single array
        int maxProduct1 = largest1 * secondLargest1;
        int minProduct1 = smallest1 * secondSmallest1;

        if (maxProduct1 > minProduct1) {
            System.out.println("Numbers multiplied: " + largest1 + " and " + secondLargest1);
            System.out.println("Biggest product = " + maxProduct1);
        } else {
            System.out.println("Numbers multiplied: " + smallest1 + " and " + secondSmallest1);
            System.out.println("Biggest product = " + minProduct1);
        }

        // Extra challenge: Two arrays
        int[] array1 = {5, 3, 5, 6, 10}; // First array
        int[] array2 = {-4, 6, 2, -9, 10}; // Second array

        // Verify both arrays have at least one element
        if (array1.length == 0 || array2.length == 0) {
            System.out.println("Both arrays must contain at least one element.");
            return;
        }

        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Get smallest and largest numbers from both arrays
        int smallestArray1 = array1[0]; // Smallest in first array
        int largestArray1 = array1[array1.length - 1]; // Largest in first array
        int smallestArray2 = array2[0]; // Smallest in second array
        int largestArray2 = array2[array2.length - 1]; // Largest in second array

        // Calculate the possible products between the two arrays
        int product1 = largestArray1 * largestArray2; // Product of the largest from both arrays
        int product2 = smallestArray1 * smallestArray2; // Product of the smallest from both arrays

        // Determine which product is larger
        if (product1 > product2) {
            System.out.println("Numbers multiplied: " + largestArray1 + " and " + largestArray2);
            System.out.println("Biggest product = " + product1);
        } else {
            System.out.println("Numbers multiplied: " + smallestArray1 + " and " + smallestArray2);
            System.out.println("Biggest product = " + product2);
        }
    }
}
