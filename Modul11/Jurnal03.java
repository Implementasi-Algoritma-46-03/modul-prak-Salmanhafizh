import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int angka = scanner.nextInt();
            if (angka == -1)
                break;
            list.add(angka);
        }

        Collections.sort(list);

        int modus = list.get(0);
        int frekuensiMaks = 0;

        for (int i = 0; i < list.size(); i++) {
            int angka = list.get(i);
            int hitung = 1;

            int j = i + 1;
            while (j < list.size() && list.get(j).equals(angka)) {
                hitung++;
                j++;
            }

            if (hitung > frekuensiMaks || (hitung == frekuensiMaks && angka > modus)) {
                frekuensiMaks = hitung;
                modus = angka;
            }

            i = j - 1;
        }

        System.out.println(modus);
        scanner.close();
    }
}
