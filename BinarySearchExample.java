

public class BinarySearchExample {
	
     public static void main(String[] args) {
        int key = 10;
        int[] a = {1, 2, 4, 10, 14, 15, 18, 20, 22, 25, 28, 33};
        
        //The binary search method  
        binarySearch (a, key);
     }
     
     //Binary Search Method
      public static void binarySearch(int[ ] array, int target) {
    	  int left = 0, right = array.length - 1, mid, counter = 1;
    	  while(left <= right) {
    		  mid = (left + right)/2;  // Take a mid position
    		  System.out.println("Comparison "+ counter + ":");
    		  System.out.println("left = " + left + ", right = " + right + ", mid = " + mid + ", array[mid] = " + array[mid] + "\n");
    		  if(array[mid] == target) {
    			  System.out.println("Key found at Pos " + mid + " after " + counter + " comparisons.");
    			  break;
    		  } 
    		  else if (array[mid] > target)
    			  right = mid-1;  // Adjust right bound of array
    		  else
    			  left = mid+1; // Adjust left bound of array
    		  counter++;
    		}
          
      } // End of method binarySearch
      
} // End of Class BinarySearchExample