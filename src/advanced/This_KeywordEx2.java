package advanced;

public class This_KeywordEx2{
	//With using this keyword 
	//this keyword is used the refer the current class instance  variable

	static class Employee1//static
	{
		String empName;
		int empId;

		Employee1(String empName,int empId)
		{
			//empName= empName;//this
			//empId=empId;//this
		}

		public void display()
		{
			System.out.println("Employee Name is -->"+empName+" and his id is "+empId);
		}

		public static void main(String args[])
		{
			Employee1 obj = new Employee1("Arun",200);
			obj.display();

			Employee1 obj1 = new Employee1("Guvi",500);
			obj1.display();
		}
	}

}




