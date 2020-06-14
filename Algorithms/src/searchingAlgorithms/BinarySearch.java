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
