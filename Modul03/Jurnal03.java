import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNilaiA = scanner.nextInt();
        double inputNilaiB = scanner.nextInt();
        double inputNilaiC = scanner.nextInt();
        double rumusNilai = ((inputNilaiA * 0.25) + (inputNilaiB * 0.35) + (inputNilaiC * 0.4));
        System.out.printf("%.2f\n", rumusNilai);
        
        boolean keterangan = rumusNilai > 75;
        System.out.println("Lulus MK: " + keterangan);
        scanner.close();
    }
}