import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilaiN = scanner.nextInt();
        int nilaiAwal = 30;

        int x = 0;
        do{
            nilaiAwal = nilaiAwal * 2;
            x += 15;
        } while (nilaiAwal < nilaiN);
 

        System.out.println(x);  

        scanner.close();
    }
}
