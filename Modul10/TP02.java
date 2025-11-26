import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();

        if (angka >= 1 && angka <= 10) {
            for (int i = 1; i <= angka; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println(i);
            }

            
            for (int i = angka - 1; i >= 1; i--) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println(i);
            }
        }

        scanner.close();
    }
}