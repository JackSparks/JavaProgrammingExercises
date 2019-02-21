package StringPalindrome;

import java.lang.reflect.Array;

public class CheckIfPalindrome {

	public boolean CheckIfPalindrome(String input) {
		
//		String[] toppings = new String[20];
//		Integer[] numbers = new Integer[29];
		
		char[] word = input.toCharArray();
		
		boolean isPalindrome = true;
		
		int pointerToEnd = word.length;
		int pointerToStart = -1;
		for (int i = 0; i<word.length; i++) {
			
			
			pointerToEnd--;
			
			pointerToStart++;
			
			if(word[pointerToEnd] != word[pointerToStart]) {
//				System.out.println(pointerToEnd + "pointer end: "+ word[pointerToEnd] + " " +  pointerToStart + " "+ word[pointerToStart]);
				isPalindrome = false;
			}else {
//				System.out.println(pointerToEnd + " pointer end: "+ word[pointerToEnd] + " " +  pointerToStart + " pointerToStart "+ word[pointerToStart]);
			}

		}
		
		return isPalindrome;
		
	}
	
}
