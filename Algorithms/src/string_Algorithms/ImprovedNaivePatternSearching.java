/*
 * 
 *   This is improved naive pattern searching alogorithm , It
 *   works in O(n) time;
 *   
 *   Note : It works only with the patterns having
 *          distinct characters;
 *          
 *   
 *   Here also we are sliding the pattern over the text but
 *   if the starting characters matches and we know that all 
 *   the characters are distinct so we increment the pattern 
 *   by no. of matched characters in the text.
 * 
 * 
 * */

package string_Algorithms;

import java.util.Scanner;

public class ImprovedNaivePatternSearching {

	static void improvedNaiveMatching(String text, String pattern) {

		int n = text.length();
		int m = pattern.length();
		boolean flag = false;
		for (int i = 0; i <= n - m;) {

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
			if (j == 0) {
				i++;
			} else
				i = i + j;

		}

		if (flag == false) {
			System.out.println("Not Present!!");
		}
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String text = kb.next();
		String pattern = kb.next();

		improvedNaiveMatching(text, pattern);

	}

}
