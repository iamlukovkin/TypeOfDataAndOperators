import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Matrix {
    public static void main(String[] args) {

    }
    public static void move(Scanner scan) {
        int matrixSize = Scan.getIntPositiveValue("Введите размерность матрицы", scan);
        System.out.println("Создана матрица: ");
        int[][] matrix = createMatrixWithRandomValues(matrixSize);
        print(matrix);
        move(matrix, scan);
    }

    public static void move(int[][] matrix, Scanner scan) {
        while (true) {
            MoveDestination destination = Scan.getMatrixDestination("Введите направление (Для выхода введите exit)", scan);
            if (destination == MoveDestination.UP) {
                matrix = moveUp(matrix);
            } else if (destination == MoveDestination.DOWN) {
                matrix = moveDown(matrix);
            } else if (destination == MoveDestination.LEFT) {
                matrix = moveLeft(matrix);
            } else if (destination == MoveDestination.RIGHT) {
                matrix = moveRight(matrix);
            } else {
                break;
            }
            print(matrix);
        }
        System.out.println("До свидания!");
    }

    public static int[][] createMatrixWithRandomValues(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = RandomGenerator.getDefault().nextInt(-matrixSize, matrixSize);
            }
        }
        return matrix;
    }

    public static int[][] moveRight(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int moveIndex;
                if (j - 1 < 0) { moveIndex = matrix.length - 1;
                } else { moveIndex = j - 1; }
                newMatrix[i][j] = matrix[i][moveIndex];
            }
        }
        return newMatrix;
    }

    public static int[][] moveLeft(int[][] matrix) {
        int [][] newMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int moveIndex;
                if (j + 1 >= matrix.length) { moveIndex = 0;
                } else { moveIndex = j + 1; }
                newMatrix[i][j] = matrix[i][moveIndex];
            }
        }
        return newMatrix;
    }

    public static int[][] moveUp(int[][] matrix) {
        int [][] newMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int moveIndex;
            if (i - 1 < 0) { moveIndex = matrix.length - 1;
            } else { moveIndex = i - 1; }
            newMatrix[i] = matrix[moveIndex];
        }
        return newMatrix;
    }

    public static int[][] moveDown(int[][] matrix) {
        int [][] newMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int moveIndex;
            if (i + 1 >= matrix.length) { moveIndex = 0;
            } else { moveIndex = i + 1; }
            newMatrix[i] = matrix[moveIndex];
        }
        return newMatrix;
    }

    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int j : row) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
