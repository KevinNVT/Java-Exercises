/* For a given input array of numbers, find the two that result in the largest product. 
The ouput should include the two numbers in the array along with their product.
As an extra challenge, use an input of two arrays of numbers and find two numbers - one from each input array - that results in the largest product.
*/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array
        int[] array = {5, 3, 8, 7, 9};
        // Get the array lenght
        int length = array.length;
        
        // Verify the array has at least two elements
        if (array.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Get the smallest numbers (Handle negative numbers)
        int smallest = array[0]; // Smallest number
        int secondSmallest = array[1]; // Second smallest number
        // Get the largest numbers
        int largest = array[length - 1]; // Largest number
        int secondLargest = array[length - 2]; // Second largest number

        int maxProduct = largest * secondLargest;
        int minProduct = smallest * secondSmallest;

        if (maxProduct > minProduct) {
            System.out.println("Numbers multiplied: " + largest + " and " + secondLargest);
            System.out.println("Biggest product = " + maxProduct);
        } else {
            System.out.println("Numbers multiplied: " + smallest + " and " + secondSmallest);
            System.out.println("Biggest product = " + minProduct);
        }

        // Extra challenge
        int[] array1 = {5, 3, 8, 7, 9}; // First array
        int[] array2 = {-4, 6, 2, -9, 10}; // Second array
        // verify both arrays have at least one element
        if (array1.length == 0 || array2.length == 0) {
            System.out.println("Both arrays must contain at least one element.");
            return;
        }
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
    }
}
