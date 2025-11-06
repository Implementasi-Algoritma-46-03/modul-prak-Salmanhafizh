import java.util.Scanner;

public class Jurnal03 {

    public static int hitungFaktorial(int angka) {
        if (angka == 0) {
            return 1;
        }

        int hasilFaktorial = 1;
        int counter = 1;

        while (counter <= angka) {
            hasilFaktorial *= counter;
            counter++;
        }

        return hasilFaktorial;
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nilaiAwal = scanner.nextInt();
        int bilanganAsli = nilaiAwal;
        int totalFaktorial = 0;

        while (nilaiAwal > 0) {
            int digit = nilaiAwal % 10;
            totalFaktorial += hitungFaktorial(digit);
            nilaiAwal /= 10;
        }

        if (totalFaktorial == bilanganAsli) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }

        

        scanner.close();
    }
}
