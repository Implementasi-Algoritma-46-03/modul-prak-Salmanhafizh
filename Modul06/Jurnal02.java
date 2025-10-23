import java.util.Scanner;

public class Jurnal02 {

    private static String ubahLirik(String lirik) {
        int panjangLirik = lirik.length();
        int sisaLirik = panjangLirik % 5;
        String lirikBaru = "";
        switch (sisaLirik) {
            case 0:
                lirikBaru = lirik.replaceAll("[IUEO]", "A");
                lirikBaru = lirikBaru.replaceAll("[iueo]", "a");
                break;
            case 1:
                lirikBaru = lirik.replaceAll("[AIUO]", "E");
                lirikBaru = lirikBaru.replaceAll("[aiuo]", "e");
                break;
            case 2:
                lirikBaru = lirik.replaceAll("[AUEO]", "I");
                lirikBaru = lirikBaru.replaceAll("[aueo]", "i");
                break;
            case 3:
                lirikBaru = lirik.replaceAll("[AIUE]", "O");
                lirikBaru = lirikBaru.replaceAll("[aiue]", "o");
                break;
            case 4:
                lirikBaru = lirik.replaceAll("[AIEO]", "U");
                lirikBaru = lirikBaru.replaceAll("[aieo]", "u");
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
