package tree;
class Node{
	int key;
	Node right;
	Node left;
	public Node(int k) {
		key=k;
		left=null;
		right=null;
	}
}
public class Inorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Node root=new Node(10);
	    	root.left=new Node(20);
	    	root.right=new Node(30);
	    	root.right.left=new Node(40);
	    	root.right.right=new Node(50);
	    	
	    	inorder(root);
	}

	private static void inorder(Node root) {
		// TODO Auto-generated method stub
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
			return;
		}
		
	}

}
