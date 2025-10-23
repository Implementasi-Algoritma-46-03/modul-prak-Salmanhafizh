import java.util.Scanner;

public class Jurnal03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angka1 = scanner.nextInt();
        char operasi = scanner.next().charAt(0);
        double angka2 = scanner.nextInt();
        double hasilBagi = 0;
        

        switch (operasi) {
            case '+':
                System.out.println((int)(angka1 + angka2));
                break;
            case '-':
                System.out.println((int)(angka1 - angka2));
                break;
            case '*':
                System.out.println((int)(angka1 * angka2));
                break;
            case '/':
                hasilBagi = (double) (angka1 / angka2);
                System.out.printf("%.7f", hasilBagi);
                break;
            default:
                break;
        }
        scanner.close();
    }
}
