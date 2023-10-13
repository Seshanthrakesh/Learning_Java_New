package basic;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder();
		sb.append("Hello");
		sb.append("world");
		System.out.println("String Builder-->"+sb);
		
		StringBuilder sb1= new StringBuilder("Hello");
		sb1.append("world 2");
		System.out.println("String Builder 2-->"+sb1);
		
		StringBuilder sb2= new StringBuilder(20);
		sb2.append("java");
		sb2.append("selenium");
		System.out.println("String buffer 3-->"+sb2);
		
		sb2.insert(1, "hello");
		System.out.println("Insert at 1-->"+sb2);                  
		
		sb2.delete(1, 6);
		System.out.println("delete from 1 to 5-->"+sb2);
		
		sb2.replace(0, 4, "python");
		System.out.println("After replacing-->"+sb2);
		
		System.out.println("Reversing a string-->"+sb2.reverse());
		
		char ch=sb2.charAt(1);
		System.out.println("Character -->"+ch);
		
		System.out.println(sb2.length());
		
		System.out.println(sb2.substring(0, 6));
		
		System.out.println(sb2.substring(6));
		
		StringBuilder sb3= new StringBuilder();
		System.out.println("Default Capacity-->"+sb3.capacity());
		sb3.append("Hello");
		System.out.println("Capacity after adding Hello-->"+sb3.capacity());
		sb3.append("java is my favourite language");
		System.out.println("Capacity after appending more than 16-->"+sb3.capacity()); 
		
		System.out.println(sb3.substring(0));
		System.out.println(sb3.toString());	
	}
}
