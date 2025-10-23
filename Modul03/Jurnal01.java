import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uangPengguna = scanner.nextInt();
        int pecahan = uangPengguna / 1000;
        int sisaPecahan = uangPengguna % 1000;
        System.out.println(pecahan);
        System.out.println(sisaPecahan);

        scanner.close();
    }
}