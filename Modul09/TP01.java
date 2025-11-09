import java.util.Scanner;

public class TP01 {

    public static void Rekursif(int angka) {
        if(angka == 0){
            return;
        }

        String jenis;

        if (angka % 2 == 0) {
            jenis = "Genap";
        } else {
            jenis = "Ganjil";
        }

        Rekursif(angka - 1);

        System.out.println(angka + " " + jenis);
        
    }
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int masukan = scanner.nextInt();

        if (masukan >= 1 && masukan <= 100) {

            Rekursif(masukan);
        
        }
        scanner.close();
    }
}
