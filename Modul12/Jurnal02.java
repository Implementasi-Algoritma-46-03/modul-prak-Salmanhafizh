import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] grid = new int[n][n];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                grid[r][c] = input.nextInt();
            }
        }

        // cek baris
        for (int r = 0; r < n; r++) {
            int val = grid[r][0];
            if (val != 0) {
                boolean match = true;
                for (int c = 1; c < n; c++) {
                    if (grid[r][c] != val) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.println(val == 1 ? "O" : "X");
                    return;
                }
            }
        }

        // cek kolom
        for (int c = 0; c < n; c++) {
            int val = grid[0][c];
            if (val != 0) {
                boolean match = true;
                for (int r = 1; r < n; r++) {
                    if (grid[r][c] != val) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.println(val == 1 ? "O" : "X");
                    return;
                }
            }
        }

        // diagonal utama
        int diagVal = grid[0][0];
        if (diagVal != 0) {
            boolean match = true;
            for (int i = 1; i < n; i++) {
                if (grid[i][i] != diagVal) {
                    match = false;
                    break;
                }
            }
            if (match) {
                System.out.println(diagVal == 1 ? "O" : "X");
                return;
            }
        }

        // diagonal kedua
        diagVal = grid[0][n - 1];
        if (diagVal != 0) {
            boolean match = true;
            for (int i = 1; i < n; i++) {
                if (grid[i][n - 1 - i] != diagVal) {
                    match = false;
                    break;
                }
            }
            if (match) {
                System.out.println(diagVal == 1 ? "O" : "X");
                return;
            }
        }

        System.out.println("?");
        input.close();
    }
}
