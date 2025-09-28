import java.util.Scanner;

public class Jurnal03 {

    public static void main(String[] args) {
        int jumlahPermen = 0;
        int jumlahTeman = 0;
        int hasilBagi = 0;
        int sisaBagi = 0;

        Scanner scanner = new Scanner(System.in);
        jumlahPermen += scanner.nextInt();
        jumlahTeman += scanner.nextInt();
        jumlahTeman += 1; // Tambah 1 untuk diri sendiri juga
        hasilBagi += jumlahPermen / jumlahTeman;
        sisaBagi += jumlahPermen % jumlahTeman;
        System.out.println(hasilBagi);
        System.out.println(sisaBagi);
        scanner.close();
    }
}
