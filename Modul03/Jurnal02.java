import java.util.Scanner;

public class Jurnal02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nilaiPertama = scanner.nextInt();
        double nilaiKedua = scanner.nextInt();
        double nilaiKetiga = scanner.nextInt();
        double rataNilai = ((nilaiPertama + nilaiKedua + nilaiKetiga) / 3);
        System.out.printf("Nilai rata-rata: %.2f\n", rataNilai);
        scanner.close();
    }
}
