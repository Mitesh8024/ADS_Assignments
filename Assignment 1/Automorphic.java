import java.util.Scanner;

public class Automorphic {
    
    public static boolean automorphic(int n, int sq) {
        int digits = String.valueOf(n).length();
        if (n == sq % (int)Math.pow(10, digits)) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        
        int sqr = num * num; // Calculate the square of the number
        
        if (automorphic(num, sqr)) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }
        
        sc.close();
    }
}