import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a Number :-");
        int num = sc.nextInt();
        if (Palindrome(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean Palindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }
}
