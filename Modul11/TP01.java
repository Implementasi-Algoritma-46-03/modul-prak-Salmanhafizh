import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pesertaArisan = scanner.nextInt();
        String arisan[] = new String[pesertaArisan];
        for (int i = 0; i < arisan.length; i++) {
            arisan[i] = scanner.next();
        }
        int i = 1;
        for (String a : arisan) {
            System.out.println("Bulan " + i + ": " + a);
            i++;
        }
        scanner.close();
        // Kerjakan soalnya di sini
    }
}
