//SuperVariable
package intermediate;
//super is a keyword which is used to refer the immediate parent class object

class Employee
{
	
	String employeeName="Arun";
}

class Employee0 extends Employee
{
	String employeeName="Guvi";
	
	void printEmployeeName()
	{
		System.out.println("Employee name in child class-->"+employeeName);
		System.out.println("Employee name in child class-->"+super.employeeName);
	}
}

public class SuperVariableEx extends Employee0 {
	
	
	public static void main(String args[])
	{
		Employee0 obj = new Employee0();
		obj.printEmployeeName();
		
	}

}