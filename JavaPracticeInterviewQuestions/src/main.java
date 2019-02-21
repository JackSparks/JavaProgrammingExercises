import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		//things that I want to be able to do:
		//java docs
		//get intput from file and from user
		//writer data to file
		
		inputFromFile x = new inputFromFile();
		
		System.out.println("Enter in the name of the file to get input");
		Scanner y = new Scanner(System.in);
		String nameOfFile = y.next();
		
		x.getDatafromFile(nameOfFile);
		
		x.writeToFile(nameOfFile);
		x.close();
	}

}
