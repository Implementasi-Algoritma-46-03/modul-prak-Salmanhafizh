import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        int pembagi = 0;
        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                pembagi++;
            }
        }
        if (pembagi == 2) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }

        scanner.close();
    }
}
