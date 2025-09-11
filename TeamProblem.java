import java.util.Scanner;

public class TeamProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int count = 0; 
        for (int i = 0; i < n; i++) {
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();

            int sum = petya + vasya + tonya;
            if (sum >= 2) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
