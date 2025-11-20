import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        int hitung = 0;

        for (int i = angka; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(hitung);
                hitung++;
                if (hitung == 10) {
                    hitung = 0;
                }
            }
            System.out.println();
        }
        scanner.close();
        // Kerjakan soalnya di sini
    }
}
