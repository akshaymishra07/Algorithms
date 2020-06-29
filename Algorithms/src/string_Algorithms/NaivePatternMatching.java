/*
 *   Pattern searching is an important problem in computer 
 *   science. When we do search for a string in notepad/word 
 *   file or browser or database, pattern searching algorithms 
 *   are used to show the search results.

     Naive Pattern Searching: The idea is to slide the 
     pattern over text one by one and check for a match. 
     If a match is found, then slides by 1 again to check 
     for subsequent matches.

     That is check for the match of the first character of 
     the pattern in the string, if it matches then check 
     for the subsequent characters of the pattern with the 
     respective characters of the string. 
     
     If a mismatch is found then move forward in the string.
     
     
     TIME COMPLEXITY : O(M* (N-M+1))
 * 
 * 
 * */


package string_Algorithms;

import java.util.Scanner;

public class NaivePatternMatching {

	static void naiveMatching(String text, String pattern) {

		int n = text.length();
		int m = pattern.length();
        boolean flag = false;
		for (int i = 0; i <= n - m; i++) {
			int j;

			for (j = 0; j < m; j++) {

				if (pattern.charAt(j) != text.charAt(i + j)) {
					break;
				}
			}

			if (j == m) {
                flag = true;
				System.out.print(i + " ");
			}

		}

		if(flag == false) {
			System.out.println("Not Present!!");
		}
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String text = kb.next();
		String pattern = kb.next();

		naiveMatching(text, pattern);

	}

}
