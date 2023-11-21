//ArrayList
package advanced;
import java.util.ArrayList;
import java.util.List;
//import java.util.*;
public class C1_Arraylist_1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		//first way to store heterogeneous data
		ArrayList al = new ArrayList();

		al.add("Java");
		al.add(100);
		al.add(12.5);
		al.add(true);
		al.add('c');
		al.add(100);
		al.add("");
		al.add(null);
		System.out.println(al);

		//second way -- to create arrayList with homogeneous data
		ArrayList<Integer> al1= new ArrayList<Integer>();
		ArrayList<String> al2= new ArrayList<String>();
		al1.add(101);
		al2.add("null");
		System.out.println(al2);

		//Third way
		List al4=new ArrayList();
		al4.add("1000");
		al4.add("2000");
		System.out.println(al4);



	}

}