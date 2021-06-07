
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i = 1, factorial = 1, number;	
    System.out.println("Enter the number:");
	Scanner sc = new Scanner(System.in);
	number = sc.nextInt();
	
	while(i<=number) {
	factorial = factorial*i;
	i++;
	}
	System.out.println("Factorial of the given number is: "+factorial);
	
	}

}
