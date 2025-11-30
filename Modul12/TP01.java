import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        int array2D[][] = new int[angka][angka];
        int hasil = 0;

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                array2D[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                hasil += array2D[i][j];
            }
        }

        System.out.println(hasil);

        scanner.close();
        // Kerjakan soalnya di sini
    }
}
