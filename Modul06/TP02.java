import java.util.Scanner;

public class TP02 {

    private static void hilangkanString(String input) {
        System.out.println(input.replaceAll("[aiueoAIUEO]", ""));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        hilangkanString(input);
        
        scanner.close();
    }
}
