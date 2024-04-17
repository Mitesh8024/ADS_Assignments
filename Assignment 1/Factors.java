import java.util.Scanner;

public class Factors {
    
    public static void factors(int n, int fact) {
        if (n == 1) {
            return;
        }
        
        if (n % fact == 0) {
            if (isPrime(fact)) {
                System.out.print(fact + " ");
            }
            factors(n / fact, fact); // Recursively find prime factors of the quotient
        } else {
            factors(n, fact + 1); // Try the next number as a potential factor
        }
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        // Loop through potential divisors from 2 to square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        System.out.println("Prime Factors are: ");
        factors(number, 2); // Start finding factors from 2 onwards
        sc.close();
    }
}