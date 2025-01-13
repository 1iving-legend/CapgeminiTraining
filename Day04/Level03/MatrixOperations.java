

import java.util.*;




public class MatrixOperations {
    public static void main(String[] args) {
	
	     MatrixUtils obj= new MatrixUtils();
	      
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int cols = scanner.nextInt();

        double[][] matrix1 = obj.createRandomMatrix(rows, cols);
        double[][] matrix2 = obj.createRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        obj.printMatrix(matrix1);

        System.out.println("Matrix 2:");
        obj.printMatrix(matrix2);

        System.out.println("Addition of matrices:");
        obj.printMatrix(obj.addMatrices(matrix1, matrix2));

        System.out.println("Subtraction of matrices:");
        obj.printMatrix(obj.subtractMatrices(matrix1, matrix2));


        if (cols == matrix2.length) {
            System.out.println("Multiplication of matrices:");
            obj.printMatrix(obj.multiplyMatrices(matrix1, matrix2));
        } else {
            System.out.println("Matrix multiplication not possible with given dimensions.");
        }

        scanner.close();
    
		  
		  
		  
		  
		  
		  
        double[][] matrix2x2 = {
            {4, 7},
            {2, 6}
        };

        double[][] matrix3x3 = {
            {6, 1, 1},
            {4, -2, 5},
            {2, 8, 7}
        };

        System.out.println("Original 2x2 Matrix:");
        MatrixUtils.printMatrix(matrix2x2);

        System.out.println("Transpose of 2x2 Matrix:");
        MatrixUtils.printMatrix(MatrixUtils.transposeMatrix(matrix2x2));

        System.out.println("Determinant of 2x2 Matrix: " + MatrixUtils.determinant2x2(matrix2x2));

        System.out.println("Inverse of 2x2 Matrix:");
        MatrixUtils.printMatrix(MatrixUtils.inverse2x2(matrix2x2));

        System.out.println("\nOriginal 3x3 Matrix:");
        MatrixUtils.printMatrix(matrix3x3);

        System.out.println("Transpose of 3x3 Matrix:");
        MatrixUtils.printMatrix(MatrixUtils.transposeMatrix(matrix3x3));

        System.out.println("Determinant of 3x3 Matrix: " + MatrixUtils.determinant3x3(matrix3x3));

        System.out.println("Inverse of 3x3 Matrix:");
        MatrixUtils.printMatrix(MatrixUtils.inverse3x3(matrix3x3));
    }
}


public class MatrixUtils {


 
    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100); // Random numbers between 0 and 100
            }
        }
        return matrix;
    }
	
	

    // Method to add two matrices
    public static double[][] addMatrices(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtractMatrices(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        double[][] result = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to calculate the determinant of a matrix (recursive)
    public static double determinant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        double det = 0;
        for (int i = 0; i < n; i++) {
            double[][] minor = getMinor(matrix, 0, i);
            det += Math.pow(-1, i) * matrix[0][i] * determinant(minor);
        }
        return det;
    }

    // Helper method to get the minor matrix
    public static double[][] getMinor(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        int r = 0;

        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                minor[r][c] = matrix[i][j];
                c++;
            }
            r++;
        }
        return minor;
    }

    // Method to find the inverse of a matrix
    public static double[][] inverseMatrix(double[][] matrix) {
        int n = matrix.length;
        double det = determinant(matrix);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }

        double[][] adjoint = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjoint[j][i] = Math.pow(-1, i + j) * determinant(getMinor(matrix, i, j));
            }
        }

        double[][] inverse = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = adjoint[i][j] / det;
            }
        }
        return inverse;
    }

    // Method to print a matrix
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }


    // Method to find the determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }

        double[][] cofactors = new double[3][3];

        cofactors[0][0] = determinant2x2(new double[][]{{matrix[1][1], matrix[1][2]}, {matrix[2][1], matrix[2][2]}});
        cofactors[0][1] = -determinant2x2(new double[][]{{matrix[1][0], matrix[1][2]}, {matrix[2][0], matrix[2][2]}});
        cofactors[0][2] = determinant2x2(new double[][]{{matrix[1][0], matrix[1][1]}, {matrix[2][0], matrix[2][1]}});

        cofactors[1][0] = -determinant2x2(new double[][]{{matrix[0][1], matrix[0][2]}, {matrix[2][1], matrix[2][2]}});
        cofactors[1][1] = determinant2x2(new double[][]{{matrix[0][0], matrix[0][2]}, {matrix[2][0], matrix[2][2]}});
        cofactors[1][2] = -determinant2x2(new double[][]{{matrix[0][0], matrix[0][1]}, {matrix[2][0], matrix[2][1]}});

        cofactors[2][0] = determinant2x2(new double[][]{{matrix[0][1], matrix[0][2]}, {matrix[1][1], matrix[1][2]}});
        cofactors[2][1] = -determinant2x2(new double[][]{{matrix[0][0], matrix[0][2]}, {matrix[1][0], matrix[1][2]}});
        cofactors[2][2] = determinant2x2(new double[][]{{matrix[0][0], matrix[0][1]}, {matrix[1][0], matrix[1][1]}});

        double[][] adjoint = transposeMatrix(cofactors);
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjoint[i][j] / determinant;
            }
        }
        return inverse;
    }

  
    
}

