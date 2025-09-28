import java.util.Scanner;

public class TP01 {

    public static void main(String[] args) {
        int tabunganAwal = 0;
        int tabunganMasuk = 0;
        int hariMenabung = 0;
        int hasilTabungan = 0;

        Scanner scanner = new Scanner(System.in);
        tabunganAwal = scanner.nextInt();
        tabunganMasuk = scanner.nextInt();
        hariMenabung = scanner.nextInt();
        hasilTabungan = tabunganAwal + (tabunganMasuk * hariMenabung);
        System.out.println(hasilTabungan);
        scanner.close();
    }
}
