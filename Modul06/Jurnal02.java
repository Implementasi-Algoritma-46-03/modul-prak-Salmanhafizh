import java.util.Scanner;

public class Jurnal02 {

    private static String ubahLirik(String lirik) {
        int panjangLirik = lirik.length();
        int sisaLirik = panjangLirik % 5;
        String lirikBaru = "";
        switch (sisaLirik) {
            case 0:
                lirikBaru = lirik.replaceAll("[iueo]", "a");
                break;
            case 1:
                // lirikBaru = lirik.replaceAll("[AIUEO]", "E");
                lirikBaru = lirik.replaceAll("[aiuo]", "e");
                break;
            case 2:
                // lirikBaru = lirik.replaceAll("[AIUEO]", "I");
                lirikBaru = lirik.replaceAll("[aueo]", "i");
                break;
            case 3:
                // lirikBaru = lirik.replaceAll("[AIUEO]", "O");
                lirikBaru = lirik.replaceAll("[aiue]", "o");
                break;
            case 4:
                // lirikBaru = lirik.replaceAll("[AIUEO]", "U");
                lirikBaru = lirik.replaceAll("[aieo]", "u");
                break;

            default:
                break;
        }

        switch (sisaLirik) {
            case 0:
                lirikBaru = lirik.replaceAll("[IUEO]", "A");
                break;
            case 1:
                lirikBaru = lirik.replaceAll("[AIUO]", "E");
                break;
            case 2:
                lirikBaru = lirik.replaceAll("[AUEO]", "I");
                break;
            case 3:
                lirikBaru = lirik.replaceAll("[AIUE]", "O");
                break;
            case 4:
                lirikBaru = lirik.replaceAll("[AIEO]", "U");
                break;
                
            default:
                break;
        }
        return lirikBaru;
    }
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lirik = scanner.nextLine();
        String hasil = ubahLirik(lirik);

        System.out.print(hasil);

        scanner.close();
    }
}
