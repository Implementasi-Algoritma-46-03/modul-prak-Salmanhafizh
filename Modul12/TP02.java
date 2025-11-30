import java.util.Scanner;


public class TP02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        int array2D[][] = new int[angka][angka];
        int array2D2[][] = new int[angka][angka];
        int array2D3[][] = new int[angka][angka];

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                array2D[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                array2D2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                array2D3[i][j] = array2D[i][j] + array2D2[i][j];
            }
        }

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                System.out.print(array2D3[i][j] + " ");
            }
            System.out.println();
        }
        

        scanner.close();
    }
}
