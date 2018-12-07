
public class SelectionSort {
	public static void main(String args[]){
		
		int temp;
		
		int[] unsorted1 = new int[] {5,9,8,7,6,0,4,3,2,1};
		
		for(int i=0; i < unsorted1.length; i++){
			int min_indx=i;
			for(int j=i+1; j < unsorted1.length; j++ ){
				if(unsorted1[min_indx] > unsorted1[j]){
					min_indx = j;
				}
			temp=unsorted1[min_indx];
			unsorted1[min_indx]=unsorted1[i];
			unsorted1[i]=temp;
			}
			
		}
		for(int i=0; i < unsorted1.length; i++)
			System.out.println( unsorted1[i]);
		
		
		//System.out.println(unsorted1[0]);
		
		
		
	}

}
