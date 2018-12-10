public class MergeSort {
	public static void main(String args[]){
		
		int[] unsorted = new int[] {0,9,8,7,6,5,4,3,2,1,0,1,2};
		int[] sortedArray = new int[unsorted.length];
		
		sortedArray = mergesort(unsorted);
		for(int i=0; i < sortedArray.length; i++)
			System.out.println( sortedArray[i]);
		
	}
	
	public static int[] mergesort(int[] unsorted){
		int lengthOfUnsortedArray = unsorted.length;
		if(lengthOfUnsortedArray <= 1){
			return unsorted;
		}
		int arrayMid = lengthOfUnsortedArray/2;
		int lengthOfUnsortedLeft=arrayMid;
		int[]  leftUnsortedArray = new int[lengthOfUnsortedLeft];
		
		int lengthOfUnsortedRight=(lengthOfUnsortedArray-arrayMid);
		int[]  rightUnsortedArray = new int[lengthOfUnsortedRight];
		int k=0;
		for(int i=0;i<lengthOfUnsortedLeft; i++){
			leftUnsortedArray[i] = unsorted[k];
			k=k+1;
		}
		for(int i=0;i<lengthOfUnsortedRight; i++){
			rightUnsortedArray[i] = unsorted[k];
			k=k+1;
		}
		int[] leftsortedArray=mergesort(leftUnsortedArray);
		int[] rightsortedArray=mergesort(rightUnsortedArray);
		int[] sortedArray=merge(leftsortedArray,rightsortedArray);
		return sortedArray;
	}
	
	
	public static int[] merge(int[] sortedArrayLeft, int[] sortedArrayRight){
		
		int i=0, j=0, k=0;
		int[] sortedArray = new int[sortedArrayLeft.length + sortedArrayRight.length];
		
		while(i < sortedArrayLeft.length && j < sortedArrayRight.length){
			if(sortedArrayLeft[i] > sortedArrayRight[j]){
				sortedArray[k] = sortedArrayRight[j];
				k=k+1;
				j=j+1;
			}
			else{
				sortedArray[k] = sortedArrayLeft[i];
				k=k+1;
				i=i+1;
			}
		}
		while(i < sortedArrayLeft.length){
			sortedArray[k] = sortedArrayLeft[i];
			k=k+1;
			i=i+1;
		}
		while(j < sortedArrayRight.length){
			sortedArray[k] = sortedArrayRight[j];
			k=k+1;
			j=j+1;
		}
		return sortedArray;
	}
}
