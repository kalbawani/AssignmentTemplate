import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your number (or -1 to stop): ");
            int range = input.nextInt();

            if (range < 0) {
                break;
            }

            int counter = 0;

            for (int i = 2; i <= range; ++i) {
                if (isPrime(i)) {
                    ++counter;
                }
            }

            System.out.printf("There are %d prime numbers between 1 and %d.%n%n", counter, range);
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}