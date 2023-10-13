package basic;

public class ArrayDeclaration {
	public static void main(String[] args) {		
		//Array is used to store multiple values of same data type in contiguous memory. Array index or subscript will start from 0
		
		//first way of creating an array
		int[] num1; //Array declaration
		num1= new int[5]; //Array initialization
		
		int[] num2= new int[5]; //will store 5 integer values
		
		num2[0] = 10;
		num2[1]=20;
		num2[2]=30;
		num2[3]=40;
		num2[4]=50;
		
		System.out.println(num2[3]);
		//System.out.println(num2[5]); It will throw Array Index Out of bound exception
		
		System.out.println("Length of the array is "+num2.length);
		
		
		//iterate over an array
		for(int i=0;i<num2.length;i++)
		{
			System.out.println("Array values are-->"+num2[i]);
		}
		
		//second way of creating an array
		int[] num3= {100,200,300};
		
		System.out.println("Length of the array is "+num3.length);
		
		//third way
		int num4[]=new int[4];
		int num5[]= {200,400};
		System.out.println(num5[1]);
		System.out.println(num4[3]);
		System.out.println(num1[1]);
		
	}



}
