import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 7, 9};
        Arrays.sort(array);

        int length = array.length;

        int elementOne = array[length - 2];
        int elementSecond = array[length - 1];

        int biggest = elementOne * elementSecond;
        System.out.println("Biggest product = " + biggest);
    }
}