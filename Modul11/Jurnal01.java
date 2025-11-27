import java.util.Scanner;
import java.util.ArrayList;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaList = new ArrayList<>();
        String nama;

        do {
            nama = scanner.next().trim();
            namaList.add(nama);
        } while (!nama.equals("-"));

        namaList.remove("-");

        int i = 1;
        for(String a:namaList){
            System.out.println("Bulan " + i + ": " + a);
            i++;
        }

        // Kerjakan soalnya di sini

        scanner.close();
    }
}
