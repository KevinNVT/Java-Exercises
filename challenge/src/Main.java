/* For a given input array of numbers, find the two that result in the largest product. 
The ouput should include the two numbers in the array along with their product.
As an extra challenge, use an input of two arrays of numbers and find two numbers - one from each input array - that results in the largest product.
*/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array
        int[] array = {5, 3, 8, 7, 9};
        // Sort the array in ascending order
        Arrays.sort(array);
        // Get the array lenght
        int length = array.length;

        int elementOne = array[length - 1]; // Largest number
        int elementSecond = array[length - 2]; // Second largest number
        int biggest = elementOne * elementSecond;

        //Two numbers multiplied
        System.out.println("Numbers multiplied: " + elementOne + " and " + elementSecond);
        // Biggest product posible
        System.out.println("Biggest product = " + biggest);
    }
}
