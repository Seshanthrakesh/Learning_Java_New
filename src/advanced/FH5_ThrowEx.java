//Throw-----> Use to create user defined Exception
package advanced;

//throw is used to create our own exceptions

public class FH5_ThrowEx{

	public static void main(String[] args) {
		
	ThrowException.throwArithmeticException(19);//19 for else

	}

}

class ThrowException
{
	static void throwArithmeticException(int age)
	{
		if(age<=18)
		{
			throw new ArithmeticException("age must be greater than 18");
			//throw new NullPointerException("age is grater than 18");
		}
		else
		{
			System.out.println("age is greater than 18");
		}
		
	}
	
}