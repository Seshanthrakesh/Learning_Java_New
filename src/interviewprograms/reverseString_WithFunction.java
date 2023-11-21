package interviewprograms;

public class reverseString_WithFunction {

	public static void main(String[] args) {
		String str1="htnahseS";
		char chr[]=str1.toCharArray();
		System.out.println(chr.length);
		for(int i=chr.length-1;i>=0;i--) {
			System.out.print(chr[i]);
		}
	}
}
