import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputan = scanner.nextInt();
        int arrayAngka[] = new int[inputan];
        for (int i = 0; i < inputan; i++) {
            arrayAngka[i] = scanner.nextInt();
        }

        for (int i = 0; i < inputan - 1; i++) {
            for (int j = 0; j < inputan - i - 1; j++) {
                if (arrayAngka[j] < arrayAngka[j + 1]) {
                    int simpanan = arrayAngka[j];
                    arrayAngka[j] = arrayAngka[j + 1];
                    arrayAngka[j + 1] = simpanan;
                }
            }
        }

        for (int a : arrayAngka) {
            System.out.print(a + " ");
        }
        
        scanner.close();
        // Kerjakan soalnya di sini
    }
}
