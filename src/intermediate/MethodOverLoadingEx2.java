package intermediate;
/*
 * Polymorphism means many forms. We have 2 types of polymorphism,
 * 
 * 1. Method overloading or compiletime polymorphism
 * 2. Method overriding or Runtime polymorphism
 * 
 * Method Overloading-->
 * If a class has 2 methods with the same name but with difference in the no. of arguments and data type
 * Method overloading should happen within the same class
 */


//Method overloading with regard to difference in the no. of arguments

public class MethodOverLoadingEx2 {
 void add(int a ,int b) {
	 int c=a+b;
	 System.out.println("addition of 2 nos: "+c);
 }
	 void add(int a ,int  b,int c) {
		 int d=a+b+c;
		 System.out.println("addition of 3 nos: "+d);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingEx2 obj = new MethodOverLoadingEx2();
		obj.add(2, 3);
		obj.add(2, 3, 4);
		
	}

}