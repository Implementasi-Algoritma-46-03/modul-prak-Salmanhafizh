import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uangTransaksi = scanner.nextInt();
        double discount = 0.05;
        double ppn = 0.11;
        int hasilDiscount = 0;
        int total;
        double hasilPajak;
        double totalBayar;

        System.out.println("Transaksi = " + uangTransaksi);

        if (uangTransaksi > 200000) {
            hasilDiscount = (int) (uangTransaksi * discount);
            total = uangTransaksi - hasilDiscount;
            System.out.println("Total = " + uangTransaksi + " - " + hasilDiscount);
        } else {
            total = uangTransaksi;
            System.out.println("Total = " + total);
        }

        hasilPajak = total * ppn;
        totalBayar = total + hasilPajak;

        System.out.printf("Ppn 11%% = %.1f\n", hasilPajak);
        System.out.printf("Total dibayar = %.1f\n", totalBayar);
        scanner.close();
    }
}
