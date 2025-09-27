import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPermen = scanner.nextInt();
        int teman = scanner.nextInt();
        teman += 1; // ditambah 1 untuk diri sendiri juga
        int hasilBagi = jumlahPermen / teman;
        int sisaBagi = jumlahPermen % teman;
        System.out.println(hasilBagi);
        System.out.println(sisaBagi);
        scanner.close();
    }
}
