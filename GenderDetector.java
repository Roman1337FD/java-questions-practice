import java.util.Scanner;
import java.util.HashSet;

public class GenderDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        HashSet<Character> uniqueChars = new HashSet<>();

        for (char c : username.toCharArray()) {
            uniqueChars.add(c);
        }

        if (uniqueChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
