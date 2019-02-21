package CheckIfNumberIsPrime;
import java.util.Scanner;

/*
 * 2. Prime number (solution)
Write a Java program to check if a given number is prime or not. Remember, a prime number is a number which is 
not divisible by any other number e.g. 3, 5, 7, 11, 13, 17 etc. Be prepared for cross e.g. checking till the square root 
of a number etc.

Read more: https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html#ixzz5g6LTCAOF
 * */
public class PrimeNumber {

	public static void main(String[] args) {

		CheckPrime x = new CheckPrime();
		Scanner y = new Scanner(System.in);
		int z = 0;
		
		System.out.println("Enter a positive integer to check if it is prime");

		try {
			
				z = y.nextInt();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (x.checkIfPrime(z)) {
			System.out.printf("%d is a prime number",z);
		} else {
			System.out.printf("%d is not a prime number",z);
		}

	}

}
