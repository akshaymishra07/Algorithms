Binary Search is a searching algorithm for searching an element in a sorted list or array. Binary Search is efficient than Linear Search algorithm and performs the search operation in logarithmic time complexity for sorted arrays or lists.

Binary Search performs the search operation by repeatedly dividing the search interval in half. The idea is to begin with an interval covering the whole array. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.




Problem: Given a sorted array arr[] of N elements, write a function to search a given element X in arr[] using Binary Search Algorithm.

Algorithm: We basically ignore half of the elements just after one comparison.

    Compare X with the middle element of the array.
    If X matches with middle element, we return the mid index.
    Else If X is greater than the mid element, then X can only lie in right half subarray after the mid element. So we will now look for X in only the right half ignoring the complete left half.
    Else if X is smaller, search for X in the left half ignoring the right half.



/*
 *  

 *  Given a sorted array arr[] of n elements, write a function 
 *  to search a given element x in arr[].
    A simple approach is to do linear search.The time 
    complexity of above algorithm is O(n). Another approach 
    to perform the same task is using Binary Search.

    Binary Search: Search a sorted array by repeatedly 
    dividing the search interval in half. Begin with an 
    interval covering the whole array. If the value of the 
    search key is less than the item in the middle of the 
    interval, narrow the interval to the lower half. Otherwise 
    narrow it to the upper half. Repeatedly check until the 
    value is found or the interval is empty.
 *  
 *  
 *  
 *  We basically ignore half of the elements just after one 
 *  comparison.

    1.Compare x with the middle element.
    
    2.If x matches with middle element, we return the mid index.
    
    3.Else If x is greater than the mid element, then x can 
    only lie in right half subarray after the mid element. So 
    we recur for right half.
    
    4.Else (x is smaller) recur for the left half.
 *  
 *  
 *  
 *   
 *   Problems related to binary search will be added soon!!!
 * 
 * */

package searchingAlgorithms;

public class BinarySearch {

	public static int binarySearch(arr[] , int key){
		
		int low  = 0 ;
		int high = arr.length-1; 
		
		int mid;
		
		while(low <= high) {
			 mid=(high+low)/2;
		      
		      if(arr[mid] == key){
		        
		        return mid;
		      }
		      else if(key<arr[mid]){
		        high = mid -1;
		        
		      }
		      else 
		         low = mid+1;
		      
			
		}
		
		return -1;
	}

}
