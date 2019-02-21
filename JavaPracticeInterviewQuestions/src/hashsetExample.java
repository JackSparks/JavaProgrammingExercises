
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hashsetExample {

	public static void main(String[] args) {

		String food[] = { "apples", "organges", "tomatoes", "avacadoe", "apples" };
		List<String> listOfFood = Arrays.asList(food);
		System.out.printf("%s", listOfFood);
		
		System.out.println();
		
		Set<String> setOfFood = new HashSet<String>(listOfFood);
		System.out.printf("%s", setOfFood);

	}

}
