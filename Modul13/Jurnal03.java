import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahArray = scanner.nextInt();
        String[] arrayString = new String[jumlahArray];

        for (int i = 0; i < jumlahArray; i++) {
            arrayString[i] = scanner.next().trim();
        }
        String cari = scanner.next().trim();

        int hasil = cariArray(arrayString, cari);

        if (hasil != -1) {
            System.out.print("Ditemukan di indeks ke-" + hasil);
        } else {
            System.out.print("Data tidak ditemukan");
        }
        
        scanner.close();
    }
    
    public static int cariArray(String[] array, String kata) {
    int panjangArray = array.length;
    for (int i = 0; i < panjangArray; i++) {
        if (array[i].equalsIgnoreCase(kata)) {
            return i;
        }
    }
    return -1;
}
}