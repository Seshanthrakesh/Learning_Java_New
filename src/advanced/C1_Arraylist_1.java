//ArrayList
package advanced;
import java.util.ArrayList;
//import java.util.*;
public class C1_Arraylist_1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
//		//second way -- to create arrayList with homogeneous data
//		ArraylistEx<Integer> al1= new ArraylistEx<Integer>();
//		ArraylistEx<String> al2= new ArraylistEx<String>();
//
//		al1.add(101);
//		
//		al2.add("null");
//		System.out.println(al2);
//		
//		//Third way
//		List al4=new ArraylistEx();
	}

}