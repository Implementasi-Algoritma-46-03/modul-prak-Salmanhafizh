import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nilaiAwal = scanner.nextDouble();
        int nilaiHari = scanner.nextInt();

        while (nilaiHari > 0) {
            nilaiAwal = nilaiAwal / 2;
            nilaiHari -= 10;
        }

        System.out.printf("%.3f", nilaiAwal);
        scanner.close();
    }
}
