package advanced;

import java.util.ArrayList;

public class CC10_ConvertArrayToArrayList {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		int arr[]= {10,20,50,100};
		
		ArrayList al = new ArrayList();
		
		
		for (int a :arr)
		{
			al.add(a);
		}
		
		System.out.println(al);
	}

}