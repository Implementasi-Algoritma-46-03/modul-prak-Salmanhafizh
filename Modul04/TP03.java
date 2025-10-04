import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dira = scanner.nextInt();
        int radi = scanner.nextInt();
        int idar = scanner.nextInt();

        if (dira > radi && dira > idar) {
            System.out.println("Dira");
        } else if (radi > dira && radi > idar) {
            System.out.println("Radi");
        } else if (idar > radi && idar > dira) {
            System.out.println("Idar");
        }

        scanner.close();
    }
}
