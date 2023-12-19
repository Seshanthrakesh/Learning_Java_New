package StarPattern_Prgm_java;

public class Increasing_starpattern {
	//increasing pyramid star pattern
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");	
			}
		System.out.println();
		}
	}

}
