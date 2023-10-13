package advanced;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FH3_FileReadingEx {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\desktop\\FileCreated.txt.txt");
		Scanner sc = new Scanner(file);
		sc.close();
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}

	}

}
