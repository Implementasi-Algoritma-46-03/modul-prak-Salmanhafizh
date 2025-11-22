import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teks = scanner.nextLine().trim();
        String hasilString[] = teks.split("\\s+");
        int jumlah = hasilString.length;
        System.out.println(jumlah);
        scanner.close();
        // Kerjakan soalnya di sini
    }
}
