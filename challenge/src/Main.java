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
    }
}
