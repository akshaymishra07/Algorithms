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
