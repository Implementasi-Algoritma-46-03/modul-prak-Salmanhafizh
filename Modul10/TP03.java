public class TP03 {

    public static void main(final String[] args) {
        for (int i = 1; i <= 100; i++) {
            int pembagi = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    pembagi++;
                }
            }
            if (pembagi == 2) {
                System.out.print(i + " ");
            }
        }
        
        // Kerjakan soalnya di sini
    }
}
