import java.util.Scanner;

public class Armstrong{
	public static int power(int base, int expo){
	if(expo==0)
		return 1;
	return base*power(base,expo-1);
	}
	public static int sum(int num){
	if(num==0)
		return 0;
	int digit = num%10;
		return power(digit,3)+sum(num/10);
	}
	public static boolean armstrong(int n){
	int s = sum(n);
	return n == s;
	}
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number: ");
	int number = sc.nextInt();
	
	if(armstrong(number)){
	System.out.println(number+" Armstrong");
	}
	else{
	System.out.println(number+" Not Armstrong");
	}
	sc.close();
	}
	}