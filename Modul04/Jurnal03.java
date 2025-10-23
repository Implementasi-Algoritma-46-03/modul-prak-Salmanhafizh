import java.util.Scanner;

public class Jurnal03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Dira = scanner.nextInt();
        int Radi = scanner.nextInt();
        int Idar = scanner.nextInt();
        String namaDira = "Dira";
        String namaRadi = "Radi";
        String namaIdar = "Idar";

        if (Dira > Radi && Dira > Idar) {
            if (Radi > Idar) {
                System.out.println(namaIdar + ", " + namaRadi + ", " + namaDira);
            } else if (Idar > Radi) {
                System.out.println(namaRadi + ", " + namaIdar + ", " + namaDira);
            }
        }else if (Radi > Dira && Radi > Idar){
            if (Dira > Idar) {
                System.out.println(namaIdar + ", " + namaDira + ", " + namaRadi);
            } else if (Idar > Dira) {
                System.out.println(namaDira + ", " + namaIdar + ", " + namaRadi);
            }
        }else if (Idar > Dira && Idar > Radi){
            if (Dira > Radi){
                System.out.println(namaRadi + ", " + namaDira + ", " + namaIdar);
            } else if (Radi > Dira) {
                System.out.println(namaDira + ", " + namaRadi + ", " + namaIdar);
            }
        }

        scanner.close();
    }
}
