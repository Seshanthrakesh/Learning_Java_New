package intermediate;
class Bike
{
	void run()
	{
		System.out.println("Bike is running");
	}
	
	void run1()
	{
		System.out.println("Bike1 is running");
	}
	
	void add(int a, int b)
	{
		int c= a+b;
		System.out.println("Addition of 2 nos "+c);
	}
		
}

public class MethodOverRidingEx2 extends Bike{
	
	//Overridden method
	void run()
	{
		System.out.println("Overridden the run method in the child class");
	}
	
	void add(int a, int b)
	{
		int c=0;
		c=a+b;
		System.out.println("The addtion of "+a+" and "+b+" is "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverRidingEx2 obj = new MethodOverRidingEx2();
		obj.run(); //method in the child class
		obj.add(5, 5);

	}

}