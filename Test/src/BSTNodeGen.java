public class BSTNodeGen <T extends Rankable>{
	
	T data;
	BSTNodeGen<T> leftNode;
	BSTNodeGen<T> rightNode;
		
	public BSTNodeGen(T data){
		
		this.data = data;
		leftNode = null;	
		rightNode  = null;
			
	}
	public int getRank(){
		return 1;
	}
	
	
}
