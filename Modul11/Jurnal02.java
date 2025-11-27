import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teks = scanner.nextLine().trim();
        String teksSplit[] = teks.split("\\s+");

        for (String a : teksSplit) {
            System.out.print(a + " ");
        }
        // Kerjakan soalnya di sini

        scanner.close();
    }
}
