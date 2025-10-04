import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilanganBulat = scanner.nextInt();
        String jawaban = "";
        if (bilanganBulat % 6 == 0) {
            jawaban = "Kelipatan enam";
        } else {
            jawaban = "Bukan kelipatan enam";
        }
        System.out.println(jawaban);

        scanner.close();
    }
}
