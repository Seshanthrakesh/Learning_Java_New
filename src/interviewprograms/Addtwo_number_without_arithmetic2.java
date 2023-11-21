package interviewprograms;

import java.util.Scanner;

public class Addtwo_number_without_arithmetic2 {

	public static  int twosum(int num1,int num2) {
		while(num2!=0) {
			int res=num1&num2;
			num1=num1^num2;
			num2=res<<1;
		}
		return num1;
	}
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the two number to sum two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Sum : "+twosum(num1,num2));
		sc.close();
	}
}


