package intermediate;
public class UsingReturnEx {
	/* Method syntax
	 * 
	 * accesssmodifier returntype methodname()
	 * {
	 * 
	 * 
	 * }
	 * 
	 * If the return type is void, its not returning anything
	  */

	public long factorialCalc(int number)
	{
		long fact = 1;
		for(int i=1;i<=number;i++) {
			fact = fact * i;
		}
		//return variable name
		return fact;
	}

	public static void main(String args[])
	{
		UsingReturnEx obj= new UsingReturnEx();
		long factResult=obj.factorialCalc(5);

		System.out.println("The factorial result is -->"+factResult);

		long factResult1=obj.factorialCalc(10);
		System.out.println("The factorial result is -->"+factResult1);
	}
}