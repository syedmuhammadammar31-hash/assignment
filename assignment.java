import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Row sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        System.out.println("Column sums:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        if (rows == cols) {
            int forwardDiagonalSum = 0;
            for (int i = 0; i < rows; i++) {
                forwardDiagonalSum += matrix[i][i];
            }
            System.out.println("\nForward diagonal sum: " + forwardDiagonalSum);

            int reverseDiagonalSum = 0;
            for (int i = 0; i < rows; i++) {
                reverseDiagonalSum += matrix[i][cols - 1 - i];
            }
            System.out.println("Reverse diagonal sum: " + reverseDiagonalSum);
        } else {
            System.out.println("\nDiagonal sums are only defined for square matrices.");
        }

        sc.close();
    }
}