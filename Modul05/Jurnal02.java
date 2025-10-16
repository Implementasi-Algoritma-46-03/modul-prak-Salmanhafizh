import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaHari = scanner.next();
        int bilanganBulat = scanner.nextInt();
        int nomorHari = 0;
        bilanganBulat = bilanganBulat % 7;
        String namaHariDiDalam = "";

        switch (namaHari) {
            case "Senin":
                nomorHari = 1;
                break;
            case "Selasa":
                nomorHari = 2;
                break;
            case "Rabu":
                nomorHari = 3;
                break;
            case "Kamis":
                nomorHari = 4;
                break;
            case "Jum'at":
                nomorHari = 5;
                break;
            case "Sabtu":
                nomorHari = 6;
                break;
            case "Minggu":
                nomorHari = 7;
                break;
            default:
                break;
        }

        nomorHari = nomorHari + bilanganBulat;
        
        switch (nomorHari) {
            case 1:
                namaHariDiDalam = "Senin";
                break;
            case 2:
                namaHariDiDalam = "Selasa";
                break;
            case 3:
                namaHariDiDalam = "Rabu";
                break;
            case 4:
                namaHariDiDalam = "Kamis";
                break;
            case 5:
                namaHariDiDalam = "Jum'at";
                break;
            case 6:
                namaHariDiDalam = "Sabtu";
                break;
            case 7:
                namaHariDiDalam = "Minggu";
                break;
            default:
                break;
        }
        System.out.println(namaHariDiDalam);
        scanner.close();
    }
}
