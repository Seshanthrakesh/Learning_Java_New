//FileWriter
package advanced;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FH4_FileWriteEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\desktop\\ses.txt");
		
		String lineToAdd="This is the first line of the program";

		FileWriter fWriter= new FileWriter(file);
		
		fWriter.write(lineToAdd);
		
		System.out.println("File is written");
		
		fWriter.close();
		
		

	}

}