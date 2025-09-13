import java.util.Scanner;

public class DominoesOnBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int maxDominoes = (M * N) / 2;
        System.out.println(maxDominoes);
    }
}
