package Lab;
import java.util.*;

public class OddEvenTranspose {
    public static void main(String[] args) {
        // Example usage
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        OddEvenTranspose t = new MatrixOperations(); // Using the child class
        t.performOperation(array); // Call the overridden method

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        displayMatrix(matrix);
        t.performOperation(matrix); // Call the overridden method
    }

    // Common method to perform an operation on an array or matrix (to be overridden)
    void performOperation(int[] arr) {
        // Default implementation in the parent class
        System.out.println("This is the parent class method.");
    }

    void performOperation(int[][] matrix) {
        // Default implementation in the parent class
        System.out.println("This is the parent class method.");
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        System.out.println("\nOriginal matrix: ");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

class MatrixOperations extends OddEvenTranspose {
    // Override the common method for arrays
    @Override
    void performOperation(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        // Count the number of even and odd elements
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create separate arrays for even and odd elements
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        int evenIndex = 0;
        int oddIndex = 0;

        // Separate even and odd elements into respective arrays
        for (int num : arr) {
            if (num % 2 == 0) {
                evenArray[evenIndex++] = num;
            } else {
                oddArray[oddIndex++] = num;
            }
        }

        // Print the results
        System.out.println("Even elements array: " + Arrays.toString(evenArray));
        System.out.println("Odd elements array: " + Arrays.toString(oddArray));
    }

    // Override the common method for matrices
    @Override
    void performOperation(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transpose matrix
        System.out.println("\nTranspose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
