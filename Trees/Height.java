package tree;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Node root=new Node(10);
	    	root.left=new Node(20);
	    	root.right=new Node(30);
	    	root.right.left=new Node(40);
	    	root.right.right=new Node(50);
	    	int h=height(root);
	    	System.out.println(h);

	}

	private static int height(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right))+1;
		
	}

}
