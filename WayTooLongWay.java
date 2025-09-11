import java.util.Scanner;
public class WayTooLongWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            if (str.length() > 10) {
                System.out.println(
                    str.charAt(0)
                    + String.valueOf(str.length() - 2)
                    + str.charAt(str.length() - 1)
                );
            } else {
                System.out.println(str);
            }
        }
        scanner.close();
    }
}
