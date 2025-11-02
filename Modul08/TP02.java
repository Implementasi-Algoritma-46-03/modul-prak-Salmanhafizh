import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int balik = 0;

        while (input > 0) {
            int digit = input % 10;
            balik = balik * 10 + digit;
            input /= 10;
        }
        
        System.out.println(balik);

        scanner.close();
    }
}
