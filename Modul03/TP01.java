import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int awal = scanner.nextInt();
        int tabung = scanner.nextInt();
        int hari = scanner.nextInt();
        int hasil = awal + (tabung * hari);
        System.out.println(hasil);
        scanner.close();
    }
}
