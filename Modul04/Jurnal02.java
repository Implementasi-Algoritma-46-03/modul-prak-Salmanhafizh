import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan = scanner.nextInt();
        int bilanganJuta = bilangan * 1000000;
        double persenPajak = 0;
        int hitungPajak = 0;
        int penghasilanBersih = 0;

        if (bilangan >= 0 && bilangan <= 50) {
            persenPajak = 0.05;
            hitungPajak = (int) (bilanganJuta * persenPajak);
            penghasilanBersih = bilanganJuta - hitungPajak;
        } else if (bilangan >= 51 && bilangan <= 250) {
            persenPajak = 0.15;
            hitungPajak = (int) (bilanganJuta * persenPajak);
            penghasilanBersih = bilanganJuta - hitungPajak;
        } else if (bilangan >= 251 && bilangan <= 500) {
            persenPajak = 0.25;
            hitungPajak = (int) (bilanganJuta * persenPajak);
            penghasilanBersih = bilangan - hitungPajak;
        } else if (bilangan > 500) {
            persenPajak = 0.3;
            hitungPajak = (int) (bilanganJuta * persenPajak);
            penghasilanBersih = bilanganJuta - hitungPajak;
        }
        persenPajak = persenPajak * 100;
        int outputPajak = (int) (persenPajak);
        System.out.println("Penghasilan kotor = " + bilangan + " juta Rupiah");
        System.out.println("Pajak " + outputPajak + "% = Rp. " + hitungPajak);
        System.out.println("Penghasilan bersih = Rp. " + penghasilanBersih);

        scanner.close();
    }
}
