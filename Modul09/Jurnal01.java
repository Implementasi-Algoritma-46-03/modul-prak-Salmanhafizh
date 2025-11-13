public class Jurnal01 {
    public static void cetakKuadrat(int a, int b) {
        if (a == 0) {
            return;
        }
        if (a > b){
            return;
        } else if(a == b){
            System.out.print((a * a));
        } else {
            System.out.print((a * a) + " ");
        }
        cetakKuadrat(a + 1, b);
    }

    public static void main(final String[] args) {
        cetakKuadrat(1, 10);
        // Kerjakan soalnya di sini
    }
}
