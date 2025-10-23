public class TP03 {
    private static void sisiPersegi(int sisi) {
        int luas = sisi * sisi;
        System.out.print(luas);
    }
    


    public static void main(final String[] args) {
        int sisi = 10;
        int sisi2 = 20;
        sisiPersegi(sisi);
        System.out.print(" ");
        sisiPersegi(sisi2);
    }
}
