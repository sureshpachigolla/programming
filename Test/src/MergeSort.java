/* Time complexity - N log N
 * Space Complexity - N Log N
 */

public class MergeSort {
	public static void main(String args[]){
		
		int[] unsorted = new int[] {0,9,0,1,11,0,5,6,11,15,18};
		int[] sortedArray = new int[unsorted.length];
		
		sortedArray = mergesort(unsorted,0, unsorted.length-1);
		for(int i = 0; i < sortedArray.length; i++)
			System.out.println( sortedArray[i]);
		
	}
	
	public static int[] mergesort(int[] unsorted, int startIndex, int endIndex){
		if(endIndex - startIndex == 0){
			return unsorted;
		}
		
		int arrayMid = (startIndex + endIndex)/2;
		int leftStartIndex = startIndex;
		int leftEndIndex = arrayMid;
		int rightStartIndex = arrayMid + 1;
		int rightEndIndex = endIndex;
		
		
		int[] unsortedLeft=mergesort(unsorted, leftStartIndex, leftEndIndex);
		int[] unSortedRight=mergesort(unsortedLeft, rightStartIndex, rightEndIndex);
		int[] sortedArray=merge(unsortedLeft,unSortedRight,leftStartIndex, rightStartIndex, rightEndIndex);
		return sortedArray;
	}
	
	public static int[] merge(int[] unsortedLeft, int[] unSortedRight,  int leftStartIndex, int rightStartIndex, int rightEndIndex){
	    
		int[] sortedArray = new int[unsortedLeft.length];
	    
	    int i = leftStartIndex;
	    int j = rightStartIndex;
	    int k = leftStartIndex;
	    
	    while(i <= rightStartIndex - 1 && j <= rightEndIndex){
			if(unsortedLeft[i] > unSortedRight[j]){
				sortedArray[k] = unSortedRight[j];
				k++;
				j++;
			}
			else{
				sortedArray[k] = unSortedRight[i];
				k++;
				i++;
			}
		}
		while(i <= rightStartIndex - 1){
			sortedArray[k] = unSortedRight[i];
			k++;
			i++;
		}
		while(j <= rightEndIndex){
			sortedArray[k] = unSortedRight[j];
			k++;
			j++;
		}
		for(k=0; k < unsortedLeft.length; k++){
			if(k < leftStartIndex || k > rightEndIndex){
				sortedArray[k] = unsortedLeft[k];
			}
		}
		
		return sortedArray;
	    
		
	}

	
}
