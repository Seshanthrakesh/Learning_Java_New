package advanced;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FH1_FileCreationEx {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter the path of the file with filename");
		Scanner sc = new Scanner(System.in);
		String fileName= sc.nextLine();
		sc.close();
		File f = new File(fileName);
		if(f.exists()) {
			System.out.println(fileName +"--->File is already Created");
		}
		else {
			f.createNewFile();
			System.out.println(fileName +" --->File is  Created");
		}
	}

}