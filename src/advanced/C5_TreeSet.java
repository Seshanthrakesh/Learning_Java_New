//Tree Set
package advanced;
import java.util.*;
//import java.util.Set;
//import java.util.TreeSet;
public class C5_TreeSet {

		public static void main(String[] args) {
			
			
			TreeSet<Integer> ts= new TreeSet<Integer>();
			ts.add(100);
			ts.add(10000);
			ts.add(10);
			ts.add(2);
			ts.add(50);
			ts.add(2);//duplicate is not allowed in set
			
			
			System.out.println("Treeset for Homogenous data-->"+ts);


		}

	}

