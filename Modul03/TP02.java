import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int amount = scanner.nextInt();
        int price = scanner.nextInt();
        int total = amount * price;
        System.out.println("Hi, " + name + ". total belanja adalah " + total + " rupiah.");
        scanner.close();
    }
}
