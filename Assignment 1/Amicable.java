import java.util.Scanner;

public class Amicable {
    
    // Method to calculate the sum of divisors of a number n
    public static int sum(int n, int divisor) {
        if (divisor == 1) {
            return 1;
        }
        if (n % divisor == 0) {
            return divisor + sum(n, divisor - 1);
        }
        return sum(n, divisor - 1);
    }

    // Method to check if two numbers are amicable
    public static boolean amicable(int n1, int n2) {
        int s1 = sum(n1, n1 / 2); // Calculate sum of divisors for n1
        int s2 = sum(n2, n2 / 2); // Calculate sum of divisors for n2
        
        return s1 == n2 && s2 == n1 && n1 != n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1st: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2nd: ");
        int num2 = sc.nextInt();

        // Check if the numbers are amicable
        if (amicable(num1, num2)) {
            System.out.println(num1 + " & " + num2 + " are Amicable");
        } else {
            System.out.println(num1 + " & " + num2 + " are not Amicable");
        }
        
        sc.close();
    }
}