//SuperMethod
package intermediate;

class Employee1
{
	void empDetails()
	{
		System.out.println("Employee Details in parent class");
	}
}

class Employee2 extends Employee1
{
	void empDetails()
	{
		System.out.println("Employee Details in Employee2");
		super.empDetails();
	}
}

class Employee3 extends Employee2
{
	void empDetails()
	{
		System.out.println("Employee Details in Child");
	}
	void printAllEmpDetails()
	{
		empDetails();
		super.empDetails();
	}
}


public class SuperMethodsEx {
	public static void main(String[] args) {
		
		Employee3 obj = new Employee3();
		obj.printAllEmpDetails();
	}

}