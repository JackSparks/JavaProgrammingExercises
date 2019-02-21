/*
 * String Palindrome (solution)
You need to write a simple Java program to check if a given String is palindrome or not. 
A Palindrome is a String which is equal to the reverse of itself e.g. "Bob" is a palindrome because of the reverse of 
"Bob" is also "Bob".  Though be prepared with both recursive and iterative solution of this problem. 
The interviewer may ask you to solve without using any library method e.g. indexOf() or subString() so be prepared for that.

Read more: https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html#ixzz5g8ImEnh8
 */
package StringPalindrome;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringPalindrome {
	
	static Scanner y;

	public static void main(String[] args) {
		
		CheckIfPalindrome x = new CheckIfPalindrome();
		try {
			y = new Scanner (new File("Palindromes.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String word;
		while(y.hasNext()) {
			word = y.next();
			System.out.println(word+ " is a palindrome: "+x.CheckIfPalindrome(word));
			System.out.println("-------------");
		}
		
	}
}
