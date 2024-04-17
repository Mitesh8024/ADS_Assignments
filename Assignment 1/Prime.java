import java.util.Scanner;
public class Prime{
	public static boolean prime(int n, int d){
	if (n<=1){
	return false;
	}
	if(d==1){
	return true;
	}
	if(n%d==0){
	return false;
	}
	return prime(n,d-1);
	}
	public static void main (String[]args){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a Number: ");
	int num = sc.nextInt();
	if(prime(num,num/2)){
	System.out.println(num+" is Prime");
	}
	else{
	System.out.println(num+" is not Prime");
	}
	sc.close();
	}
	}