import java.util.Random;

public class MatrixOperations {

    // Methods to create various matrix manipulation tasks
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers between 0 and 9
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length, cols1 = matrix1[0].length, cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
        return matrix[0][0] * determinant2x2(new int[][]{{matrix[1][1], matrix[1][2]}, {matrix[2][1], matrix[2][2]}})
                - matrix[0][1] * determinant2x2(new int[][]{{matrix[1][0], matrix[1][2]}, {matrix[2][0], matrix[2][2]}})
                + matrix[0][2] * determinant2x2(new int[][]{{matrix[1][0], matrix[1][1]}, {matrix[2][0], matrix[2][1]}});
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        return new double[][]{
                {matrix[1][1] / (double) determinant, -matrix[0][1] / (double) determinant},
                {-matrix[1][0] / (double) determinant, matrix[0][0] / (double) determinant}
        };
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = createRandomMatrix(3, 3);
        int[][] matrix2 = createRandomMatrix(3, 3);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Addition
        System.out.println("Addition:");
        displayMatrix(addMatrices(matrix1, matrix2));

        // Subtraction
        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        // Multiplication
        System.out.println("Multiplication:");
        displayMatrix(multiplyMatrices(matrix1, matrix2));

        // Transpose
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        // Determinant
        System.out.println("Determinant of Matrix 1:");
        System.out.println(determinant3x3(matrix1));

        // Inverse
        try {
            System.out.println("Inverse of Matrix 1:");
            displayMatrix(inverse2x2(new int[][]{{1, 2}, {3, 4}})); // Using a 2x2 matrix
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
