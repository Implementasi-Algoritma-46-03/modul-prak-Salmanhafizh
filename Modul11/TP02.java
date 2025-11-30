import java.util.Arrays;
import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputan = scanner.nextInt();
        int[] arrayAngka = new int[inputan];

        scanner.nextLine();
        String line = scanner.nextLine();
        String[] parts = line.trim().split("\\s+");

        int jumlahInput = parts.length; 
        for (int i = 0; i < jumlahInput && i < inputan; i++) {
            arrayAngka[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(arrayAngka, 0, jumlahInput);

        for (int i = jumlahInput - 1; i >= 0; i--) {
            System.out.print(arrayAngka[i] + " ");
        }

        scanner.close();
    }
}
