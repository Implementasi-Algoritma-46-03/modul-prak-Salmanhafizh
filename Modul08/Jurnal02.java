import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilaiAwal = 0;
        int hitungPenjualan = 0;
        double uang = 0;
        do {
            nilaiAwal = scanner.nextInt();
            uang += nilaiAwal;
            hitungPenjualan += 1;
        } while (nilaiAwal != 0);
        hitungPenjualan -= 1;
        uang = uang / hitungPenjualan;

        System.out.printf("%.2f", uang);

        scanner.close();
    }
}
