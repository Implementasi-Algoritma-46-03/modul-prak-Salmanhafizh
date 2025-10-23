import java.util.Scanner;

public class Jurnal02 {

    private static String ubahLirik(String lirik) {
        int panjangLirik = lirik.length();
        int sisaLirik = panjangLirik % 5;
        String lirikBaru = "";
        switch (sisaLirik) {
            case 0:
                lirikBaru = lirik.replaceAll("[AIUEO]", "A");
                lirikBaru = lirik.replaceAll("[aiueo]", "a");
                break;
            case 1:
                lirikBaru = lirik.replaceAll("[AIUEO]", "E");
                lirikBaru = lirik.replaceAll("[aiueo]", "e");
                break;
            case 2:
                lirikBaru = lirik.replaceAll("[AIUEO]", "I");
                lirikBaru = lirik.replaceAll("[aiueo]", "i");
                break;
            case 3:
                lirikBaru = lirik.replaceAll("[AIUEO]", "O");
                lirikBaru = lirik.replaceAll("[aiueo]", "o");
                break;
            case 4:
                lirikBaru = lirik.replaceAll("[AIUEO]", "U");
                lirikBaru = lirik.replaceAll("[aiueo]", "u");
                break;

            default:
                break;
        }
        return lirikBaru;
    }
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lirik = scanner.nextLine();

        System.out.println(ubahLirik(lirik));

        scanner.close();
    }
}
