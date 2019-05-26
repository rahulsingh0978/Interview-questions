package rahul_practice.com.practice;


public class BinaryTree {
	Node root;
	BinaryTree(){
		root=null;
	}
	void printInorder(Node root) {
		if(root ==null)
			return;
		System.out.println(root.data);
		printInorder(root.left);
		printInorder(root.right);
	}
	public static void main(String[] args) {
		BinaryTree node =new BinaryTree();
		node.root = new Node(23);
		node.root.left = new Node(2);
		node.root.right = new Node(34);
		node.root.right.left = new Node(22);
		node.printInorder(node.root);
		
	}
}
