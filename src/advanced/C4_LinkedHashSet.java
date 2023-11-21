package advanced;
import java.util.LinkedHashSet;
public class C4_LinkedHashSet {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add("python");
		lhs.add(1000);
		lhs.add(true);
		lhs.add(null);
		lhs.add("Selenium");
		lhs.add(1000);
		
		System.out.println("Default LinkedHashset-->"+lhs);

	}


	
	
}
