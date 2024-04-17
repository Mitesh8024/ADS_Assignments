import java.util.Scanner;

public class Ramanujan {

    public static boolean ramanujan(int n, int a, int b, int count) {
        if (count == 0) {
            // Check if the sum of cubes of a and b equals n
            return (a * a * a + b * b * b) == n;
        }

        // Loop through possible cube roots
        for (int i = 1; i * i * i < n; i++) {
            if (ramanujan(n, i, b, count - 1)) {
                return true;
            }
            if (ramanujan(n, a, i, count - 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        if (ramanujan(num, 1, 1, 2)) {
            System.out.println(num + " is a Ramanujan Number");
        } else {
            System.out.println(num + " is not a Ramanujan Number");
        }

        sc.close();
    }
}