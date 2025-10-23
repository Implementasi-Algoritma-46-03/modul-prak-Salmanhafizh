import java.util.Scanner;

public class TP01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tabunganAwal = scanner.nextInt();
        int tabunganMasuk = scanner.nextInt();
        int hariMenabung = scanner.nextInt();
        int hasilTabungan = tabunganAwal + (tabunganMasuk * hariMenabung);
        System.out.println(hasilTabungan);
        scanner.close();
    }
}
