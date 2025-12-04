import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matriks = new int[n][n];
        int[][] hasil = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = matriks[n - 1 - i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(hasil[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
