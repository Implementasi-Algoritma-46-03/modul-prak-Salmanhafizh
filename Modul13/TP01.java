import java.util.Scanner;
import java.util.ArrayList;

public class TP01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> array1 = new ArrayList<>();
        ArrayList<Double> array2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            double angka = scanner.nextDouble();
            array1.add(angka);
        }

        for (int i = 0; i < 10; i++) {
            double angka = scanner.nextDouble();
            array2.add(angka);
        }

        sortArray(array1);
        sortArray(array2);

        for (int i = 0; i < array1.size(); i++) {
            if (i + 1 == array1.size()) {
                System.out.printf("%.2f",array1.get(i));
            } else {
                System.out.printf("%.2f ",array1.get(i));
            }
        }

        System.out.println();

        for (int i = 0; i < array2.size(); i++) {
            if (i + 1 == array2.size()) {
                System.out.printf("%.2f",array2.get(i));
            } else {
                System.out.printf("%.2f ",array2.get(i));
            }
        }

        scanner.close();
    }

    public static void sortArray(ArrayList<Double> array) {
        int panjangArray = array.size();
        for (int i = 1; i < panjangArray; i++) {
            for (int j = panjangArray - 1; j >= i; j--) {
                double check = array.get(j);
                if (array.get(j - 1) >= check) {
                    double sementara = array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, sementara);
                }
            }
        }
    }
}
