//Question 13 Compare
package advanced;
import java.util.ArrayList;
class Swap2ArrayList {
	public static void main(String[] args) {
		 ArrayList<String> al1= new ArrayList<String>();
		    al1.add("Maruthi");
		    al1.add("Mahindra");
		    al1.add("Tata");
		    al1.add("Hyundai");
		    ArrayList<String> al2= new ArrayList<String>();
		    al2.add("Maruthi");
		    al2.add("Mahindra");
		    al2.add("Tata");  	
		    ArrayList<String> al3= new ArrayList<String>();
		    //Ternary operator
		    //condition? yes: No
		    //a=10,b=5	
		    //a>b ? "greater":"lesser"
		    for(String c:al1)
		   {
		     al3.add(al2.contains(c)?"Yes":"No");
		  }
		    System.out.println("compared arraylist-->"+al3);
	}
}