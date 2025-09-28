import java.util.Scanner;

public class ReverseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        String reversedS = new StringBuilder(s).reverse().toString();

    
        if (reversedS.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
