package basic;

public class Factorialobj {

	
	// TODO Auto-generated method stub
	int employeeAge=100;
	public void FactorialCalculation()
	{
		int number = 5;
		int factorial = 1;
		for (int i=1; i<=number; i++)
		{
			factorial = factorial * i;
		}
		System.out.println("Factorial is: "+factorial);
	}
		public void FactorialCalculationwithNos(int number)
		{
			//int number = 5;
			int factorial = 1;
			for (int i=1; i<=number; i++)
			{
				factorial = factorial * i;
			}
			System.out.println("Factorial is: "+factorial);
		}
		public static void main(String[] args)
		{Factorialobj obj = new Factorialobj();
		obj.FactorialCalculation();
		obj.FactorialCalculationwithNos(6);
		
			
		}
}
