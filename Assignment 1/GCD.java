import java.util.Scanner;

public class GCD{
public static int gcd(int n1, int n2){
	if(n2==0){
		return n1;
		}
		else
		{
		return gcd(n1,n1%n2);
		}
	}
	public static void main (String []args){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter First Number: ");
	int n1 = sc.nextInt();
	System.out.println("Enter Second Number: ");
	int n2 = sc.nextInt();
	int result = gcd(n1,n2);
	System.out.println("GCD: "+result);
	sc.close();
	}
}
