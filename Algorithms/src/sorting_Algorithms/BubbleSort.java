/*
 *   --BUBBLE SORT--
 *   
 *   Inplace sorting algorithm with time complexity O(n^2)
 *  
 * */

package sorting_Algorithms;

import java.util.Scanner;

public class BubbleSort {

	static void bubbleSort(int arr[]) {
		
		int n = arr.length;
		boolean swapped = false;
		for(int i = 0 ; i < n-1 ; i++) {
			
			for(int j = 0 ; j < n - i - 1 ; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					swapped = true;
					
				}
			}
			
			if(swapped == false) {
				break;
				
			}
			
		}
		
		
	}
	
	static void printArray(int arr[]) {
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			arr[i] = kb.nextInt();
			
		}
		
		bubbleSort(arr);
		printArray(arr);

	}

}
