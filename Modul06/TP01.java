import java.util.Scanner;

public class TP01 {

    private static double toCelcius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    private static double toReamur(double fahrenheit) {
        return (4.0 / 9.0) * (fahrenheit - 32);
    }

    private static void printResultC(double fahrenheit) {
        double hasilCelcius = toCelcius(fahrenheit);
        System.out.printf("%.1f", hasilCelcius);
    }
    private static void printResultR(double fahrenheit) {
        double hasilReamur = toReamur(fahrenheit);
        System.out.printf("%.2f", hasilReamur);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit1 = scanner.nextDouble();
        double fahrenheit2 = scanner.nextDouble();
        double fahrenheit3 = scanner.nextDouble();

        System.out.print("Celcius: ");
        printResultC(fahrenheit1);
        System.out.print(" ");
        printResultC(fahrenheit2);
        System.out.print(" ");
        printResultC(fahrenheit3);
        System.out.print("\n");
        System.out.print("Reamur: ");
        printResultR(fahrenheit1);
        System.out.print(" ");
        printResultR(fahrenheit2);
        System.out.print(" ");
        printResultR(fahrenheit3);
        scanner.close();
    }
}
