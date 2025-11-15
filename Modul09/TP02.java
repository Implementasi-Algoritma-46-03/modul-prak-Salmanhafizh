import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kataString = scanner.nextLine().replaceAll(" ", "").toLowerCase();
        int panjangString = kataString.length();
        int jumlah = 0;
        char target1 = 'a';
        char target2 = 'i';
        char target3 = 'u';
        char target4 = 'e';
        char target5 = 'o';

        for (int i = 0; i < panjangString; i++) {
            if (kataString.charAt(i) == target1) {
                jumlah += 1;
            } else if (kataString.charAt(i) == target2) {
                jumlah += 1;
            } else if (kataString.charAt(i) == target3) {
                jumlah += 1;
            } else if (kataString.charAt(i) == target4) {
                jumlah += 1;
            } else if (kataString.charAt(i) == target5) {
                jumlah += 1;
            }

        }
        
        /*
         * cara itu ribet banget wehhh
         * String vocal = 'aiueo';
         * for(int i = 0; i < panjangString; i++){
         *   if(vocal.indexOf(kataString.charAt(i) != -1)){
         *      jumlah++;
         *   }    
         * }
         * 
         * nah ini baru better ahaha, salman-salman...
         */
        
        System.out.println(jumlah);

        scanner.close();
    }
}
