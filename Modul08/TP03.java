import java.util.Scanner;

public class TP03 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hasil = 0;
        int input = 0;
        do {
            input = scanner.nextInt();
            hasil += input;
        } while (input != 0);
        System.out.println(hasil);
        scanner.close();
    }
}
