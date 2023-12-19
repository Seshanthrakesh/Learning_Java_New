package intermediate;
interface A1
{
	void a();
}

interface B1 extends A1
{
	void b();
}

public class InterfaceEx3 implements B1 {
	
	
	public void a() {
		
		System.out.println("Method A");
		
	}

	
	public void b() {
		
		System.out.println("Method B");

	}

	public static void main(String[] args) {
		
		InterfaceEx3 obj = new InterfaceEx3();
				obj.a();
				obj.b();

	}
}