package advanced;
import java.io.File;
import java.util.Scanner;

public class FH2_FileDeletionEx {

	public static void main(String[] args) {
		System.out.println("Enter the file to be deleted");
		try (Scanner sc = new Scanner(System.in)) {
			String fileToBeDeleted=sc.nextLine();

			File f = new File(fileToBeDeleted);

			if(f.exists())
			{
				f.delete();
				System.out.println("File is deleted successfully");
			}
			else
			{
				System.out.println("File not deleted");
			}
		}



	}

}