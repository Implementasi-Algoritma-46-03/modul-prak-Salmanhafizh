import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahArray = scanner.nextInt();
        String[] arrayString = new String[jumlahArray];

        for (int i = 0; i < jumlahArray; i++) {
            arrayString[i] = scanner.next().trim().toUpperCase();
        }

        insertionSort(arrayString);

        for (int i = 0; i < jumlahArray; i++) {
            String hasil = arrayString[i].substring(0, 1).toUpperCase()
                         + arrayString[i].substring(1).toLowerCase();
            System.out.print(hasil + (i + 1 == jumlahArray ? "" : " "));
        }
        scanner.close();
    }

    public static void insertionSort(String[] array) {
        int panjang = array.length;
        for (int i = 1; i < panjang; i++) {
            String key = array[i];
            int j = i - 1;

            while (j >= 0 && compareStrings(array[j], key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return len1 - len2;
    }
}