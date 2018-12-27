import java.util.LinkedList;
import java.util.Queue;

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


public class BinarySearchTree {
	
	public class NodeBST {
		int data;
		NodeBST leftNode;
		NodeBST rightNode;
		
		public NodeBST(int key){
			data = key;
			leftNode = null;	
			rightNode = null;
			
		}
		public NodeBST(NodeBST node){
			data = node.data;
			leftNode = node.leftNode;	
			rightNode = node.rightNode;
			
		}
	}
		
	public NodeBST insertRec(NodeBST root, int data){
		if(root == null){
			root = new NodeBST(data);
		}
		else{
			if (root.data <= data){
				root.rightNode = insertRec(root.rightNode, data);
			}else{
				root.leftNode = insertRec(root.leftNode, data);
			}
		}
		return root;
	}
		
	public void printNode(NodeBST root){
		if(root != null){
			printNode(root.leftNode);
			System.out.println(root.data);
			printNode(root.rightNode);
			
		}
	}
	
	public void printNodeBreadth(NodeBST root){
		
		NodeBST nodeConsidered;
		if(root != null){
			q.add(root);
		}
		
		while (!q.isEmpty()){
			nodeConsidered = new NodeBST(q.remove());
			System.out.println(nodeConsidered.data);
			
			if (nodeConsidered.leftNode != null){
				q.add(nodeConsidered.leftNode);
			}
			if (nodeConsidered.rightNode != null){
				q.add(nodeConsidered.rightNode);
			}
			
		}
		
	}
	
	NodeBST root;
	
	BinarySearchTree(){
		root = null;
	}
	Queue<NodeBST> q = new LinkedList<>();

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
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
		System.out.println("Inorder output");
		bst.printNode(bst.root);
		
		System.out.println("level order with queue");
		bst.printNodeBreadth(bst.root);
		
		
		
		

	}

}
