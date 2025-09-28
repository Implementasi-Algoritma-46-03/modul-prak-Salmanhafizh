import java.util.Scanner;

public class TP02 {

    public static void main(String[] args) {
        String namaPembeli;
        int jumlahBelanjaan = 0;
        int hargaBelanjaan = 0;
        int totalBelanjaan = 0;

        Scanner scanner = new Scanner(System.in);
        namaPembeli = scanner.next();
        jumlahBelanjaan += scanner.nextInt();
        hargaBelanjaan += scanner.nextInt();
        totalBelanjaan += jumlahBelanjaan * hargaBelanjaan;
        System.out.println("Hi " + namaPembeli + ", total belanja adalah " + totalBelanjaan + " rupiah.");
        scanner.close();
    }
}
