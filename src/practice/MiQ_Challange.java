package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class MiQ_Challange {
	
	static class TreeNode {
        int key;
        TreeNode left, right;
        public TreeNode(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }
	
	static void solve(int[][] edges, int N){
        // return an array with arr[0] = center of the circle and arr[1] = radius
        // of the circle.
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
        TreeNode root = null;
        for (int i=0; i<N-1; i++) {
            if (!hm.containsKey(edges[i][0])) {
                ArrayList<Integer> al = new ArrayList<Integer>();   al.add(edges[i][1]);
                hm.put(edges[i][0], al);
            }
            else {
            	ArrayList<Integer> al = hm.get(edges[i][0]);
            	al.add(edges[i][1]);
                hm.replace(edges[i][0], al);
            }
        }
        //Queue<Integer> q = new LinkedList<Integer>();
        int firstKey = hm.keySet().iterator().next();
        root = new TreeNode(firstKey);
        
        makeTree(root, hm);
    }
	static void makeTree(TreeNode root, HashMap<Integer, ArrayList<Integer>> hm) {
		int key = root.key;
		
		if (hm.containsKey(hm.get(key).get(0))) {
			
		}
	}

}
