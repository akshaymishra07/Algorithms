/*
 *  
 *  Given a text and a pattern , we need to find if the
 *  pattern is present in the text or Anagram of pattern is
 *  present in the text.
 *  
 *  EXAMPLES :
 *  
 *  I/P :  text- geeksforgeeks
 *         pattern - frog
 *  O/P :  YES
 *  
 *  I/P :  text- geeksforgeeks
 *         pattern - reek
 *  O/P :  NO
 *  
 *  
 *  ----------SOLUTION-----------
 *  
 *  The naive approach is to slide the pattern over the text
 *  and for each window check whether the pattern and part of
 *  text are anagram of each other or not.
 *  
 *  
 *  Time : O((n-m+1) * m)
 *  
 *  n = length of text
 *  m = length of pattern
 *  
 * 
 * */


package string_Algorithms;

import java.util.Scanner;

public class AnagramSearch {

	static boolean checkAnagram(String text, String pattern, int i) {

		int arr[] = new int[26];

		for (int j = 0; j < pattern.length(); j++) {

			arr[pattern.charAt(j) - 'a']++;
			arr[text.charAt(i + j) - 'a']--;

		}
		
		for(int k = 0 ; k < arr.length ; k++) {
			
			if(arr[k] != 0) {
				return false;
			}
			
		}
       
		return true;
	}

	static boolean naiveAnagramSearch(String text, String pattern) {
		
		int n = text.length();
		int m = pattern.length();

		for (int i = 0; i <= n - m; i++) {

			if (checkAnagram(text, pattern, i)) {

				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String text = kb.next();
		String pattern = kb.next();

		boolean result = naiveAnagramSearch(text, pattern);

		if (result) {

			System.out.println("YES");
		} else
			System.out.println("NO");
	}

}
