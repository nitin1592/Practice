package trees;

public class TreeTraversal {
	
	public static void inOrder(Node root) {
		inOrder(root.left);
		System.out.println(root.data + " ");
		inOrder(root.right);
	}
}
