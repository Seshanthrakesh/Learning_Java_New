package interviewprograms;

import java.util.Scanner;

public class Addtwo_number_without_plusSymbol {

	public static  int twosum(int a,int b) {
		for(int i=1;i<=b;i++) {
			a++;
		}
		return a;
	}
	public static void main(String[] args) {
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the two number to sum two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		System.out.println("Sum : "+twosum(a,b));

	}
}


