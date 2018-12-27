/* Binary search tree implementation
 *                     10
 *                    /  \
 *                   /    \
 *                  5     20
 *                 /\     /\
 *                /  \   /  \
 *               4   8  19  25
 *                    \      \
 *                     \      \
 *                     9      30
 */
public class BinarySearchTreeWithCount {
	
	public class NodeBST {
		int data;
		int leftNodeCount;
		int rightNodeCount;
		NodeBST leftNode;
		NodeBST rightNode;
		
		public NodeBST(int key){
			data = key;
			leftNodeCount = 0;
			rightNodeCount = 0;
			leftNode = null;	
			rightNode = null;
			
		}
	}
	public NodeBST insertRec(NodeBST root, int data){
		if(root == null){
			root = new NodeBST(data);
		}
		else{
			if (root.data <= data){
				root.rightNodeCount = root.rightNodeCount+1;
				root.rightNode = insertRec(root.rightNode, data);
			}else{
				root.leftNodeCount = root.leftNodeCount+1;
				root.leftNode = insertRec(root.leftNode, data);
			}
		}
		return root;
	}
		
	public void printNode(NodeBST root){
		if(root != null){
			printNode(root.leftNode);
			System.out.printf("data = %d , left NodeCount = %d , right NodeCount = %d", root.data, root.leftNodeCount, root.rightNodeCount).println();;
			printNode(root.rightNode);
			
		}
	}

	
	NodeBST root;
	
	BinarySearchTreeWithCount(){
		root = null;
	}
	

	public static void main(String[] args) {
		
		BinarySearchTreeWithCount bst = new BinarySearchTreeWithCount();
		
		bst.root = bst.insertRec(bst.root,10);
		bst.root = bst.insertRec(bst.root,20);
		bst.root = bst.insertRec(bst.root,5);
		bst.root = bst.insertRec(bst.root,8);
		bst.root = bst.insertRec(bst.root,25);
		bst.root = bst.insertRec(bst.root,30);
		bst.root = bst.insertRec(bst.root,9);
		bst.root = bst.insertRec(bst.root,4);
		bst.root = bst.insertRec(bst.root,19);
		
		//Print depth first
		System.out.println("Inorder output with counts");
		bst.printNode(bst.root);
		

	}

}
