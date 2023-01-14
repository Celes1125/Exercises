import java.util.Scanner;

//Guessing if a number is prime
public class LoopsAndConditionals1 {
        public static void main(String[] args) {
            System.out.println("Escriba un número. Si es primo figurará el mensaje 'true'");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            boolean isPrime = true;
            for (int i = 2; i < number ; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            System.out.println(isPrime);
        }

    }


