import java.util.Scanner;

public class Jurnal02 {

    private static String ubahLirik(String lirik) {
        int panjangLirik = lirik.length();
        int sisaLirik = panjangLirik % 5;
        String lirikBaru = "";
        switch (sisaLirik) {
            case 0:
                lirikBaru = lirik.replaceAll("[AIUEOaiueo]", "a");
                break;
            case 1:
                lirikBaru = lirik.replaceAll("[AIUEOaiueo]", "e");
                break;
            case 2:
                lirikBaru = lirik.replaceAll("[AIUEOaiueo]", "i");
                break;
            case 3:
                lirikBaru = lirik.replaceAll("[AIUEOaiueo]", "o");
                break;
            case 4:
                lirikBaru = lirik.replaceAll("[AIUEOaiueo]", "u");
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
