package advanced;

public class FH7_UncheckedExceptionEx {
	//runtime exceptions or unchecked exceptions. These exceptions will be thrown only when there is error in runtime which we wont be able to predict
	//If any exception is thrown, it will come out of the program abruptly. We can handle this using Exception handling mechanism,

	/*
	 * 1. Try/catch Block
	 * 2. throws 
	 * 3. throw
	 */

	/*
	 * try
	 * {
	 * 		//we will write code that might throw exception
	 * }
	 * catch(Exception x)
	 * {
	 * 		//the thrown exception will be caught in catch block
	 * }
	 */

	public static void main(String[] args) {
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Arimetic Exception is Caught");
		}
		finally {
			System.out.println("Inside finally block");
		}
		try {
			int [] arr = {3};
			System.out.println(arr[2]); 
		}
		catch(Exception r) {
			System.err.println("Invalid array index "); 
			r.printStackTrace();//to print the exceptions details
		}
		finally {
			System.out.println("Inside finally block");
		}
		System.out.println("Out of all block");
	}
}
