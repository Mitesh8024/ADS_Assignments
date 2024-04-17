import java.util.Scanner;

public class Perfect{
public static int sum(int n, int divisor){
	if (divisor==1)
		return 1;
	if(n%divisor==0){
		return divisor+sum(n,divisor-1);
	}
	return sum(n,divisor-1);
}
 public static boolean perfect(int num){
	int sum = sum(num,num/2);
	return sum==num;
	}
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int number = sc.nextInt();

	if(perfect(number)){
		System.out.println(number+" Perfect Number");
		}
		else{
		System.out.println(number+" Not Perfect Number");
		}
	sc.close();
	}
}