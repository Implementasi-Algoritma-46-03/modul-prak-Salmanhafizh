import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        int top = 0;
        int bottom = size - 1;
        int left = 0;
        int right = size - 1;

        int value = 1;

        while (value <= size * size) {
            for (int row = top; row <= bottom; row++) {
                matrix[row][left] = value++;
            }
            left++;

            for (int col = left; col <= right; col++) {
                matrix[bottom][col] = value++;
            }
            bottom--;

            for (int row = bottom; row >= top; row--) {
                matrix[row][right] = value++;
            }
            right--;

            for (int col = right; col >= left; col--) {
                matrix[top][col] = value++;
            }
            top++;
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                if (c >= 1) System.out.print(" ");
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
        input.close();
    }
}
