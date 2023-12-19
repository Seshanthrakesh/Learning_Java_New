package intermediate;
public class ConstructorEx {
	public ConstructorEx()
	{
		System.out.println("Default constructor"); 
	}
	public void method() {
		
		System.out.println("normal method"); 
	}
	public static void main(String[] args) {
		
		ConstructorEx obj = new ConstructorEx();	
		obj.method();

	

}
}