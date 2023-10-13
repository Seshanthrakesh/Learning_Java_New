package intermediate;
class A {
	private int b=10;
	int a=10;
	private void msg() 
	{
		System.out.println("Private method");
	}
	void msg1() 
	{
		System.out.println("Not a private Method");
	}
}
public class PrivateAccessModifierEx {

	public static void main(String[] args) {
		
		A obj = new A ();
		obj.msg1();
		System.out.println(obj.a);
		//compile time error
		//obj.msg();
		//System.out.println(obj.b);
		

	}

}