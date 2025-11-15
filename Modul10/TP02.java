import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        if (angka <= 10 && angka >= 1) {
            for (int i = 1; i <= angka; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i == j) {
                        System.out.print(j);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }

            for (int x = angka - 1; x >= 1; x--) {
                for (int y = 1; y <= angka - 1; y++) {
                    if (x == y) {
                        System.out.print(y);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
       

        scanner.close();


        // Kerjakan soalnya di sini
    }
}
