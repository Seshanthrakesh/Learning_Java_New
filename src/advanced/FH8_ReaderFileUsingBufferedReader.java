//ReaderFile Using BufferReader
package advanced;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FH8_ReaderFileUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Seshu-PC\\guvigit\\learning_java\\Helloworld.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		br.close();
		String str;

		while( (str=br.readLine())  != null)
		{
			System.out.println(str);
		}

	}

}