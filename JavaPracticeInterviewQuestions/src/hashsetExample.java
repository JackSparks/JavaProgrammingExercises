
import java.io.File;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class hashsetExample {

	public static void main(String[] args) {

		String food[] = { "apples", "organges", "tomatoes", "avacadoe", "apples" };
		List<String> listOfFood = Arrays.asList(food);
		System.out.printf("%s", listOfFood);
		
		System.out.println();
		
		Set<String> setOfFood = new HashSet<String>(listOfFood);
		System.out.printf("%s", setOfFood);
		
//		Map vehicles = new HashMap();
//		Stack <String> stackOfCards= new Stack<>();
//		Queue<Integer> q = new LinkedList<>(); 
//		String food[] = { "apples", "organges", "tomatoes", "avacadoe", "apples" };
//		List<String> listOfFood = Arrays.asList(food);
//		Set<String> setOfFood = new HashSet<String>(listOfFood);
//		
//		x = new Scanner(new File(nameOfFile));
//		System.out.println(x.next());
//		z = new Formatter(new File(nameOfFile));
//		z.format("%s", dataForFile);
//		x.close();
//		char[] word = input.toCharArray();
	}

}
