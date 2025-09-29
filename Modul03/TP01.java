public class TP01 {

    public static void main(String[] args) {
        int tabunganAwal = 250000;
        int tabunganMasuk = 25000;
        int hariMenabung = 30;
        int hasilTabungan = 0;

        hasilTabungan += tabunganAwal + (tabunganMasuk * hariMenabung);
        System.out.println(hasilTabungan);
    }
}
