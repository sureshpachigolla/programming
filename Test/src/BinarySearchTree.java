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
		
		public NodeBST(int data){
			this.data = data;
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
			nodeConsidered = q.remove();
			//nodeConsidered = new NodeBST(q.remove());
			System.out.println(nodeConsidered.data);
			
			if (nodeConsidered.leftNode != null){
				q.add(nodeConsidered.leftNode);
			}
			if (nodeConsidered.rightNode != null){
				q.add(nodeConsidered.rightNode);
			}
			
		}
		
	}
	
	public boolean searchNode(NodeBST root, int num){
		
		while(root!= null){
			if(root.data > num){
				root = root.leftNode;
			}else if (root.data < num){
				root = root.rightNode;
			}else{
				return true;
			}
		}
		return false;
	}
	
	public void insertRecLoop(NodeBST root, int num){
		
		while(true){
			if (root.data > num){
				if (root.leftNode == null){
					root.leftNode = new NodeBST(num);
					break;
				}	
				root = root.leftNode;
			}else if(root.data < num) {
				if (root.rightNode == null){
					root.rightNode = new NodeBST(num);
					break;
				}
				root = root.rightNode;
			}else{
				System.out.println("duplicate insertion not allowed: "+ num);
				break;
			}
		}
	}
	
	NodeBST root;
	
	BinarySearchTree(){
		root = null;
	}
	
	public BinarySearchTree(int num){
		root = new NodeBST(num);
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
		
		//Print level order
		System.out.println("level order with queue");
		bst.printNodeBreadth(bst.root);
		
		//search in BST
		boolean foundSW = bst.searchNode(bst.root,19);
		System.out.println("element found : " + foundSW );
		
		//insert nodes using loops
		BinarySearchTree bstloop = new BinarySearchTree(10);
		
		//bstloop.root = bstloop.insertRecLoop(bstloop.root,10);
		bstloop.insertRecLoop(bstloop.root,20);
		bstloop.insertRecLoop(bstloop.root,5);
		bstloop.insertRecLoop(bstloop.root,8);
		bstloop.insertRecLoop(bstloop.root,25);
		bstloop.insertRecLoop(bstloop.root,30);
		bstloop.insertRecLoop(bstloop.root,9);
		bstloop.insertRecLoop(bstloop.root,4);
		bstloop.insertRecLoop(bstloop.root,19);
		
		System.out.println("level order with queue");
		bstloop.printNodeBreadth(bstloop.root);

	}

}
