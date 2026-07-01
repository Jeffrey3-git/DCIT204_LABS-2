import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for size
        System.out.print("Enter the size of the array: ");
        int arrSize = scanner.nextInt();

        int[] array = new int[arrSize];

        // Prompt to accept each array element
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Prompt for Target Sum
        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        boolean found = false;

        // Brute Force (Nested Loop) Search
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    // Display results
                    System.out.println("\n--- PAIR FOUND ---");
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Values : " + array[i] + " and " + array[j]);
                    System.out.println("Equation: " + array[i] + " + " + array[j] + " = " + targetSum);

                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        // message if no pair exists
        if (!found) {
            System.out.println("\nNo pair exists that matches the target sum.");
        }

        scanner.close();
    }
}
