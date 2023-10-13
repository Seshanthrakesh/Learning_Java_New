package intermediate;

public class ParameterizedConstructor {
	int employeeAge;
	String employeeName;
	public ParameterizedConstructor (int age,String name) {
		employeeAge=age;
		employeeName=name;
		System.out.println("The employee name is "+employeeName+" and his age is "+employeeAge);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor obj =new ParameterizedConstructor(25,"Rakesh");
		ParameterizedConstructor obj1 =new ParameterizedConstructor(24,"Aby");

	}

}