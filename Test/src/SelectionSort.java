
public class SelectionSort {
	public static void main(String args[]){
		
		int temp;
		
		int[] unsorted = new int[] {5,9,8,7,6,0,4,3,2,1};
		
		for(int i=0; i < unsorted.length; i++){
			int min_indx=i;
			for(int j=i+1; j < unsorted.length; j++ ){
				if(unsorted[min_indx] > unsorted[j]){
					min_indx = j;
				}
				temp=unsorted[min_indx];
				unsorted[min_indx]=unsorted[i];
				unsorted[i]=temp;
			}
		}
		
		for(int i=0; i < unsorted.length; i++)
			System.out.println( unsorted[i]);
	}

}
