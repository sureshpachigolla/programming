

public class BSTwithGenerics <T extends Rankable> {
	
	BSTNodeGen<T> root;
	
	BSTwithGenerics(){
		root = null;
	}
	
	public BSTwithGenerics(T data){
		root = new BSTNodeGen(data);
	}
	
	public BSTNodeGen insertRec(BSTNodeGen root, T data){
		if(root==null){
			root = new BSTNodeGen(data);
		}else if(root.data.rollNum <= data.rollNum){
			root.rightNode = insertRec(root.rightNode, data);
		}else{
			root.leftNode = insertRec(root.leftNode, data);
		}
		return root;
	}
	
	public void printNode(BSTNodeGen root){
		if(root != null){
			printNode(root.leftNode);
			System.out.println(root.data.rollNum);
			printNode(root.rightNode);
		}
	}
	
	
	public static void main(String[] args) {
		BSTwithGenerics<Student> bst = new BSTwithGenerics<Student>();
		
		bst.root = bst.insertRec(bst.root,new Student(10,"suresh",90,"dallas"));
		bst.root = bst.insertRec(bst.root,new Student(20,"sneha",92,"dallas"));
		bst.root = bst.insertRec(bst.root,new Student(5,"sidhu",95,"sfo"));
		bst.root = bst.insertRec(bst.root,new Student(8,"steve",80,"sfo"));
		bst.root = bst.insertRec(bst.root,new Student(25,"john",90,"dallas"));
		bst.root = bst.insertRec(bst.root,new Student(30,"sneha",92,"dallas"));
		bst.root = bst.insertRec(bst.root,new Student(9,"sidhu",95,"sfo"));
		bst.root = bst.insertRec(bst.root,new Student(4,"steve",80,"sfo"));
		bst.root = bst.insertRec(bst.root,new Student(19,"suresh",90,"dallas"));
		
		bst.printNode(bst.root);
	}

}
