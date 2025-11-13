import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        int hasil = 0;
        for (int i = 1; i <= angka; i++) {
            if (i % 2 != 0) {
                hasil += i;
            }
        }
        System.out.println(hasil);

        scanner.close();
    }
}
