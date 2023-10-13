package advanced;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FH6_CheckedExceptionEx {
	//Checked Exception
	public static void main(String[] args) throws FileNotFoundException  {

		//first way to handle checked exceptions

		try
		{
			File file = new File("C:\\Users\\Seshu-PC\\guvigit\\learning_java\\Helloworld3.txt");
			Scanner sc = new Scanner(file);
			sc.close();		
		}
		catch(Exception ex)
		{

			ex.printStackTrace();
		}
		finally
		{
			System.out.println("In Finally block");
		}
		System.out.println("Outside finally");

		File file = new File("C:\\Users\\Seshu-PC\\guvigit\\learning_java\\Helloworld.txt");
		Scanner sc = new Scanner(file);
		System.out.println("Throws exception");
		sc.close();

	}

}

