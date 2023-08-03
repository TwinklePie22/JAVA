package JAVA_INTERNAL;

public class MatrixAdditionP1 {


        public static void main(String[] args) {
            int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[][] matrix2 = {
                    {9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 1}
            };

            int[][] resultMatrix = addMatrices(matrix1, matrix2);

            // Display the result matrix
            System.out.println("Result Matrix:");
            displayMatrix(resultMatrix);
        }

        // Method to add two matrices and return the result as a new matrix
        public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
            int rows = matrix1.length;
            int columns = matrix1[0].length;
            int[][] resultMatrix = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            return resultMatrix;
        }

        // Method to display a matrix
        public static void displayMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }


