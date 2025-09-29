import java.util.Scanner;

public class TramCapacity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 

        int currentPassengers = 0;
        int maxPassengers = 0;

        for (int i = 0; i < n; i++) {
            int exit = scanner.nextInt();   
            int enter = scanner.nextInt();  

            currentPassengers -= exit;
            currentPassengers += enter;

            
            if (currentPassengers > maxPassengers) {
                maxPassengers = currentPassengers;
            }
        }

        System.out.println(maxPassengers);
    }
}
