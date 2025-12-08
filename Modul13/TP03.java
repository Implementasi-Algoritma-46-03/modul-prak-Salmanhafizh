import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahMahasiswa = scanner.nextInt();
        int[] array = new int[jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int input = scanner.nextInt();
            array[i] = input;
        }
        int target = scanner.nextInt();

        int hasil = lookForIt(array, target);

        if (hasil != -1) {
            System.out.print("Ditemukan di indeks ke-" + hasil);
        } else {
            System.out.print("Tidak ditemukan");
        }

        scanner.close();
        // Kerjakan soalnya di sini

    }

    public static int lookForIt(int[] array, int target) {
        int length = array.length;
        int hasil = 0;
        for (int i = 0; i < length; i++) {
            if (target == array[i]) {
                hasil = i;
                return hasil;
            }
        }
        return -1;
    }
}
