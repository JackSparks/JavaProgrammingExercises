import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class inputFromFile {

	private Formatter z;
	Scanner x = null;

	public void getDatafromFile(String nameOfFile) {

		

		try {
			x = new Scanner(new File(nameOfFile));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}

		while (x.hasNext()) {
			System.out.println(x.next());
		}
	}

	public void writeToFile(String nameOfFile) {
		System.out.println("What would you like to overwrite the file with?");
		try {
			z = new Formatter(new File(nameOfFile));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		String dataForFile = x.next();
		
		z.format("%s", dataForFile);
	}

	public void close() {
		x.close();
		
	}
}
