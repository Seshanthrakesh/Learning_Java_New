package intermediate;
	//Method Overriding:
	/*
	 * Method overriding or Runtime polymorphism
	 * 
	 * If both the parent class and child class has the same method signature, then that method is called as a Overridden method
	 * 
	 * method overriding is used to give a different implemenetation in the child class
	 * It comes with parent child relationship. method overriding will happen in the child class
	 * 
	 * Same method signature--> no difference in the no. of arguments and no difference in the datatype of the arguments
	 * 
	 * 
	 */

	class RBI
	{
		void interest()
		{
			System.out.println("Interest rate of personal loan is with in 10");
		}
	}

	class HDFC extends RBI
	{
		void interest()
		{
			System.out.println("Interest rate of personal loan is 9");

		}
	}

	class ICICI extends RBI
	{
		void interest()
		{
			System.out.println("Interest rate of personal loan is 8");
		}
	}

	class AXIS extends RBI
	{
		void interest()
		{
			System.out.println("Interest rate of personal loan is 8.5");
		}
	}

	public class MethodOverRidingEx1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	  		HDFC hdfc= new HDFC();
	  		hdfc.interest();
	  		
	  		ICICI icici= new ICICI();
	  		icici.interest();
	  		
	  		AXIS axis = new AXIS();
	  		axis.interest();
		}

	}

