import java.util.Scanner;

public class TP03 {

    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * (faktorial(n - 1));
        }
    }
        

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int angka = scanner.nextInt();
        
        System.out.println(faktorial(angka));

        scanner.close();
    }
}
