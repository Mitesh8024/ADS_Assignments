import java.util.Scanner;

public class LCM{
	public static int lcm(int n1, int n2){
	return((n1*n2)/gcd(n1,n2));
}
	public static int gcd(int n1,int n2){
	if(n2==0)
		return n1;
	else
		return gcd(n2,n1%n2);
	}
	
	public static void main(String []args){
 	Scanner sc = new Scanner (System.in);
	System.out.println("Enter First Number: ");
	int n1 = sc.nextInt();
	System.out.println("Enter Second Number: ");
	int n2 = sc.nextInt();
	int result = lcm(n1,n2);
	System.out.println("LCM: "+result);
	sc.close();
}
}
