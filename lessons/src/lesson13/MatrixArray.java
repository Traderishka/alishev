package lesson13;

public class MatrixArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 5}, {2, 7, 3}};

        int lines = 0;
        int columns = 0;
        while (lines < matrix.length) {
            while (columns < matrix[lines].length) {
                System.out.print(matrix[lines][columns]);
                columns++;
                if (columns == matrix[lines].length) {
                    columns = 0;
                    break;
                }
            }
            System.out.println();
            lines++;
            if (lines == matrix.length) {
                break;
            }
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int[] array : matrix) {
            for (int index : array) {
                System.out.print(index);
            }
            System.out.println();
        }

    }
}
