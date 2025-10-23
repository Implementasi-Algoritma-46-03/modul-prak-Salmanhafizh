import java.util.Scanner;

public class TP03 {

    private static void hitungPersegi(int sisi) {
        System.out.print((sisi * sisi) + " " + (4 * sisi));
    }

    private static void hitungPersegiPanjnag(int panjang, int lebar) {
        System.out.println((panjang * lebar) + " " + (2 * (panjang + lebar)));
    }
    
    private static void hitungSegitiga(int alas, int tinggi) {
        double miring = Math.sqrt(alas * alas + tinggi * tinggi);
        double hitungMiring = miring;
        miring = (int) miring;
        double sisaMiring = hitungMiring - miring;
        if (sisaMiring >= 0.5) {
            hitungMiring = (int) hitungMiring + 1;
        }
        System.out.println(((alas * tinggi) / 2) + " " + ((int) (alas + tinggi + hitungMiring)));
    }

    private static void hitungLingkaran(int diameter) {
        double r = diameter / 2.0;
        double luas = 3.14 * r * r;
        double keliling = 3.14 * diameter;
        System.out.printf("%.2f %.2f\n", luas, keliling);
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaBentuk = scanner.nextLine();
        
        
        switch (namaBentuk) {
            case "Persegi":
                int sisi = scanner.nextInt();
                hitungPersegi(sisi);
                break;
            case "Persegi Panjang":
                int panjang = scanner.nextInt();
                int lebar = scanner.nextInt();
                hitungPersegiPanjnag(panjang, lebar);
                break;
            case "Segitiga":
                int alas = scanner.nextInt();
                int tinggi = scanner.nextInt();
                hitungSegitiga(alas, tinggi);
                break;
            case "Lingkaran":
                int diameter = scanner.nextInt();
                hitungLingkaran(diameter);
                break;
        
            default:
                break;
        }

        scanner.close();
    }
}
