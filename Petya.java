import java.util.Scanner;

public class Petya{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String vowels = "aoyeui"; 
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (vowels.indexOf(ch) == -1) { 
                result.append('.').append(ch);
            }
        }

        System.out.println(result.toString());
    }
}
