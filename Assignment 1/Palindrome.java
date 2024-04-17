import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true; // Base case: if start meets or exceeds end, it's a palindrome
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; // Characters at start and end positions don't match
        }
        return isPalindrome(str, start + 1, end - 1); // Recursively check inner substring
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        String strnum = String.valueOf(n);

        if (isPalindrome(strnum, 0, strnum.length() - 1)) {
            System.out.println(n + " is Palindrome");
        } else {
            System.out.println(n + " is not Palindrome");
        }
        sc.close();
    }
}