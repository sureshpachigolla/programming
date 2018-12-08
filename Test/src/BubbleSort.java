
public class BubbleSort {

	public static void main(String args[]){
				
		int[] unsorted = new int[] {0,9,8,7,6,5,4,3,2,1};
		int temp;
		
		for (int i=0; i < unsorted.length-1; i++){
			for (int j=i+1; j <unsorted.length; j++){
				if (unsorted[i] > unsorted[j]){
					temp=unsorted[i];
					unsorted[i]=unsorted[j];
					unsorted[j]=temp;
				}
			}
		}
		for(int i=0; i < unsorted.length; i++)
			System.out.println( unsorted[i]);
		
		
	}
}
