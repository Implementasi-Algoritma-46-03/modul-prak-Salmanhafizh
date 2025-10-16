import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kodeMenu = scanner.nextInt();
        int jumlahMakanan = scanner.nextInt();
        int hargaMakanan = 0;
        int totalHarga = 0;
        String namaMakanan = "";

        switch (kodeMenu) {
            case 1:
                namaMakanan = "Nasi Goreng";
                hargaMakanan = 15000;
                break;
            case 2:
                namaMakanan = "Mie Goreng / Nyemek";
                hargaMakanan = 18000;
                break;
            case 3:
                namaMakanan = "Kwetiau Goreng / Nyemek" ;
                hargaMakanan = 20000;
                break;
            case 4:
                namaMakanan = "Capcay Goreng / Kuah";
                hargaMakanan = 23000;
                break;
            default:
            System.out.println("Tidak ada di menu!");
                break;
        }
        totalHarga = jumlahMakanan * hargaMakanan;
        hargaMakanan = totalHarga / 1000;
        System.out.println(namaMakanan + " " + jumlahMakanan + " buah, total harga Rp. " + hargaMakanan + ".000");
        scanner.close();
    }
}
