package trees;

import java.util.HashMap;

public class CloneRandomTree {
	
	public void inOrder(RandomTree root) {
		if (root == null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		System.out.print( (root.random == null) ? "null" : root.random.data );
		System.out.print("	");
		inOrder(root.right);
	}
	
	public void cloneTree(RandomTree root) {
		if (root == null)
			return;
		HashMap<RandomTree, RandomTree> hm = new HashMap<RandomTree, RandomTree>();
		RandomTree newRoot = populateLeftRight(root, hm);
		populateRandom(root, newRoot, hm);
		inOrder(newRoot);
	}
	
	public RandomTree populateLeftRight(RandomTree root, HashMap<RandomTree, RandomTree> hm) {
		if (root == null)
			return null;
		
		RandomTree newNode = new RandomTree(root.data);
		hm.put(root, newNode);
		newNode.left = populateLeftRight(root.left, hm);
		newNode.right = populateLeftRight(root.right, hm);
		return newNode;
	}
	
	public void populateRandom(RandomTree root, RandomTree newRoot, HashMap<RandomTree, RandomTree> hm) {
		if (newRoot != null) {
			newRoot.random = hm.get(root.random);
			populateRandom(root.left, newRoot.left, hm);
			populateRandom(root.right, newRoot.right, hm);
		}
	}
}
