import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaPembeli = scanner.next();
        int jumlahBelanjaan = scanner.nextInt();
        int hargaBelanjaan = scanner.nextInt();
        int totalBelanjaan = jumlahBelanjaan * hargaBelanjaan;
        System.out.println("Hi, " + namaPembeli + ". Total belanja adalah " + totalBelanjaan + " rupiah.");
        scanner.close();
    }
}
