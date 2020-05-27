
/*       LINEAR SEARCH ALGORITHM
 * 
 *    In this we linearly traverse the whole array 
 *    until the desired key is found. If the key is 
 *    found then we returns it index and if key is not 
 *    found then the linear search function returns -1 to 
 *    the parent call.
 *    
 *    The time complexity for this algorithm is : O(n) --> n is length of array
 * 
 * */

package searchingAlgorithms;

import java.util.Scanner;

public class LinearSearch {
	
	static int linearSearch(int arr[] , int key) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] == key) {
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = kb.nextInt();
		}
		
		int key = kb.nextInt();
	    int result = linearSearch(arr , key);
	    
	    if(result == -1) {
	    	System.out.println("Key Not Found!!");
	    }
	    else
	    	System.out.println("Key present at : "+result);

	}

}
