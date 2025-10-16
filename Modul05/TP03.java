import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bangun = scanner.nextLine();
        
        switch (bangun) {
            case "Persegi":
                int sisi = scanner.nextInt();
                System.out.println((sisi * sisi) + " " + (4 * sisi));
                break;

            case "Persegi Panjang":
                int panjang = scanner.nextInt();
                int lebar = scanner.nextInt();
                System.out.println((panjang * lebar) + " " + (2 * (panjang + lebar)));
                break;

            case "Segitiga":
                int alas = scanner.nextInt();
                int tinggi = scanner.nextInt();
                double miring = Math.sqrt(alas * alas + tinggi * tinggi);
                double hitungMiring = miring;
                miring = (int) miring;
                double sisaMiring = hitungMiring - miring;
                if (sisaMiring >= 0.5) {

                    hitungMiring = (int) hitungMiring + 1;
                }
                System.out.println(((alas * tinggi) / 2) + " " + ((int) (alas + tinggi + hitungMiring)));
                break;

            case "Lingkaran":
                int diameter = scanner.nextInt();
                double r = diameter / 2.0;
                double luas = 3.14 * r * r;
                double keliling = 3.14 * diameter;
                System.out.printf("%.2f %.2f\n", luas, keliling);
                break;
        }
        


        
        scanner.close();
    }
}