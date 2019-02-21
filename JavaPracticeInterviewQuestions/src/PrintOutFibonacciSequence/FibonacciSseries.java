package PrintOutFibonacciSequence;
import java.io.File;
import java.util.Scanner;

/*Write a simple Java program which will print Fibonacci series e.g. 1 1 2 3 5 8 13 ... . up to a given number. 
 * Be prepare for cross questions like using iteration over recursion and how to optimize the solution using caching and 
 * memoization.
*/

//Read more: https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html#ixzz5g1Aorrj4
public class FibonacciSseries {

	/**
	 * 
	 * @param main
	 */
	public static void main(String[] args) {

		// Scanner x = new Scanner(System.in);
		// System.out.println("Enter in a value");
		// String y = x.next();
		// System.out.println(y);
		// Scanner z = null;
		//
		// try {
		// z = new Scanner(new File("sample.txt"));
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// while (z.hasNext()) {
		// System.out.println(z.next());
		// }
		//
		// while (z.hasNext()) {
		// System.out.println(z.next());
		// }

		Scanner x = new Scanner(System.in);
		int y;
		try {
			System.out.println("What value would you like the fibonnaci series to go up to?");
			y = x.nextInt();

			Fibonacci fibonacciLister = new Fibonacci();
			fibonacciLister.numberIterations(y);
			
			System.out.println("-----------------");
			
			for(int i=1; i<=y; i++){ 
				System.out.print(fibonacciLister.addValueWithRecursion(i) +" "); 
				}

		} catch (Exception e) {
			System.out.println("didn't enter in an interger");
			e.printStackTrace();
		}

	}
}
