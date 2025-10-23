import java.util.Scanner;

public class Jurnal01 {

    private static void sapaMahasiswa(String a, String b, int c) {
        String jam = "";
        if (c >= 6 && c <= 11) {
            jam = "pagi";
        }else if (c >= 12 && c <= 14) {
            jam = "siang";
        }else if (c >= 15 && c <= 17) {
            jam = "sore";
        } else if ((c >= 18 && c <= 24) || (c <= 5 && c >= 1)) {
            jam = "malam";
        } else {
            System.out.println("");
        }
        System.out.println("Halo, " + a + ". Selamat " + jam + ".");
        System.out.println("Halo, " + b + ". Selamat " + jam + ".");
    }
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaPertama = scanner.nextLine();
        String namaKedua = scanner.nextLine();
        int waktu = scanner.nextInt();

        sapaMahasiswa(namaPertama, namaKedua, waktu);

        scanner.close();
    }
}
