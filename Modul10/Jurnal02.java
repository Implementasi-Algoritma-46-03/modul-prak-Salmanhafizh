import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        scanner.close();
       
        // Kerjakan soalnya di sini
    }
}
