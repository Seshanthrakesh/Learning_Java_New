package interviewprograms;

import java.util.Scanner;

public class swapTwoNumbers_withThirdVariable {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		sc.close();
		System.out.println("Before Swapping : "+num1+" "+num2);
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("After Swapping : "+num1+" "+num2);
	}

}
