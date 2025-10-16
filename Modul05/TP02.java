import java.util.Scanner;

public class TP02 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int hariKe = N % 7;

        switch (hariKe) {
            case 0:
                System.out.println("vendredi");
                break;
            case 1:
                System.out.println("samedi");
                break;
            case 2:
                System.out.println("dimanche");
                break;
            case 3:
                System.out.println("lundi");
                break;
            case 4:
                System.out.println("mardi");
                break;
            case 5:
                System.out.println("mercredi");
                break;
            case 6:
                System.out.println("jeudi");
                break;
        }

        scanner.close();
    }
}