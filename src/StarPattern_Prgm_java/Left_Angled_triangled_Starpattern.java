package StarPattern_Prgm_java;

public class Left_Angled_triangled_Starpattern {

	public static void main(String[] args) {
		 int n=6; 
		  
	        // outer loop to handle rows 
	        for (int i=0;i<=n;i++) { 
	  
	            // inner loop to print spaces. 
	            for (int j=0;j<n-i;j++) { 
	                System.out.print(" "); 
	            } 
	  
	            // inner loop to print stars. 
	            for (int k=0;k<=i;k++) { 
	                System.out.print("*"); 
	            } 
	  
	            // printing new line for each row 
	            System.out.println(); 
		}
	}
}
