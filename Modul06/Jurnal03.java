import java.util.Scanner;

public class Jurnal03 {

    public static void volumeTabung(double r, double h, double t) {
        double volume = 3.14159 * r * r * h;

        double volumeIsi = 3.14159 * r * r * t;

        double persen = (volumeIsi / volume) * 100 ;

        System.out.printf("%.2f %.2f %.1f", volume , volumeIsi, persen);
        System.out.print("%");

    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        double jari = scanner.nextDouble();
        double tinggi = scanner.nextDouble();
        double ketinggian = scanner.nextDouble();

        volumeTabung(jari, tinggi, ketinggian);


        scanner.close();
    }
}
