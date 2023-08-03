import java.util.Arrays;

class ArrayOperations {
    // Method to separate even and odd elements of an array
    void separateEvenOdd(int[] arr) {
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
}

class MatrixOperations extends ArrayOperations {
    // Method to find the transpose of a matrix
    void transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transpose matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class OddEvenTranspose {
    public static void main(String[] args) {
        // Example usage
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        arrayOperations.separateEvenOdd(arr);

        MatrixOperations matrixOperations = new MatrixOperations();
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        matrixOperations.transposeMatrix(matrix);
    }
}
