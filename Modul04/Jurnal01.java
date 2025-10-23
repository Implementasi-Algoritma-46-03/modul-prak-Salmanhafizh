import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan = scanner.nextInt();
        
        if (24 % bilangan == 0 && 56 % bilangan == 0) {
            System.out.println("Faktor dari 24 dan 56");
        } else {
            System.out.println("Bukan faktor dari 24 dan 56");
        }

        scanner.close();
    }
}
