/*
 *  ---SELECTION SORT---	
 *   
 *    Inplace sorting algorithm with time complexity O(n^2)
 *    
 *    Note : It is an unstable sorting algorithm.
 *  
 * 
 * */


package sorting_Algorithms;

import java.util.Scanner;

public class SelectionSort {
	
	static void selectionSort(int arr[]) {
		int n = arr.length;
		int minIndex ;
		for(int i = 0 ; i < n-1  ; i++ ) {
			
			minIndex = i;
			for(int j = i+1 ; j < n ; j++) {
				
				if(arr[j] < arr[minIndex] ) {
					
					minIndex = j ;
					
				}
			}
			
			if(minIndex != i) {
				
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
			
		}
		
		
		
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();

		}

		selectionSort(arr);
		printArray(arr);

	}

}
