package advanced;

import java.util.LinkedHashMap;

public class C8_LinkedHashMap {
	public static void main(String[] args) {

		LinkedHashMap<Object,Object> lhm= new LinkedHashMap<Object,Object>();

		lhm.put(101, "java");
		lhm.put(102, "python");
		lhm.put(103, "selenium");
		lhm.put(104, 2000);
		lhm.put(null, "20");
		lhm.put(110, null);

		System.out.println("Default lhm-->"+lhm);



	}
}
