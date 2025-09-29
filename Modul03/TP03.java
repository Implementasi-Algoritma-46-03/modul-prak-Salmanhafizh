import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPermen = scanner.nextInt();
        int jumlahTeman = scanner.nextInt();
        int totalOrang = jumlahTeman + 1;
        int hasilBagi = jumlahPermen / totalOrang;
        int sisaBagi = jumlahPermen % totalOrang;
        System.out.println(hasilBagi);
        System.out.println(sisaBagi);
        scanner.close();
    }
}
