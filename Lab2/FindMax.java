import java.util.Scanner;

public class FindMax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++){
            System.out.print("Enter element [" + i + "]: "); // Cleaner console layout
            array[i] = scanner.nextInt();
        }

        // Initialize markers
        int maxValue = array[0];
        int maxIndex = 0;

        // Optimization: Start at index 1 since index 0 is already maxValue
        for (int i = 1; i < array.length; i++){
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Maximum Value : " + maxValue);
        System.out.println("Found at Index: " + maxIndex);

        scanner.close();
    }
}