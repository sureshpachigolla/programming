/* Time complexity - N log N
 * Space Complexity - N
 */

public class MergeSort {
	public static void main(String args[]){
		
		int[] unsorted = new int[] {0,9,0,1,11,0,5,6,11,15,18};
		
		mergesort(unsorted,0, unsorted.length-1);
		for(int i = 0; i < unsorted.length; i++)
			System.out.println( unsorted[i]);
		
	}
	
	public static void mergesort(int[] unsorted, int startIndex, int endIndex){
		if(endIndex - startIndex == 0){
			return;
		}
		
		int arrayMid = (startIndex + endIndex)/2;
		int leftStartIndex = startIndex;
		int leftEndIndex = arrayMid;
		int rightStartIndex = arrayMid + 1;
		int rightEndIndex = endIndex;
		
		
		mergesort(unsorted, leftStartIndex, leftEndIndex);
		mergesort(unsorted, rightStartIndex, rightEndIndex);
		merge(unsorted,leftStartIndex, rightStartIndex, rightEndIndex);
		
	}
	
	public static void merge(int[] unsorted, int leftStartIndex, int rightStartIndex, int rightEndIndex){
	    
		int[] sortedArray = new int[unsorted.length];
	    
	    int i = leftStartIndex;
	    int j = rightStartIndex;
	    int k = leftStartIndex;
	    
	    while(i <= rightStartIndex - 1 && j <= rightEndIndex){
			if(unsorted[i] > unsorted[j]){
				sortedArray[k] = unsorted[j];
				j++;
			}
			else{
				sortedArray[k] = unsorted[i];
				i++;
			}
			k++;
		}
		while(i <= rightStartIndex - 1){
			sortedArray[k] = unsorted[i];
			k++;
			i++;
		}
		while(j <= rightEndIndex){
			sortedArray[k] = unsorted[j];
			k++;
			j++;
		}
		for(k=leftStartIndex; k <= rightEndIndex; k++){
			unsorted[k] = sortedArray[k];
		}
		
	}

	
}
