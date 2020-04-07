package trees;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.PriorityQueue;

import practice.Pair;
import practice.PrintAllPathsMatrix;

public class Main {
	
	public static void main(String[] args) throws IOException {
		int m = 3; 
        int n = 3; 
        int mat[][] = { { 1, 2, 3 },  
                        { 4, 5, 6 }, 
                        { 7, 8, 9 } }; 
        int maxLengthOfPath = m + n - 1;
        int[] arr = new int[maxLengthOfPath];
        new PrintAllPathsMatrix().printAllPaths(mat, m, n, 0, 0, arr, 0);
		
//		Node root = new Node(1);
//		root.left = new Node(2); 
//        root.right = new Node(3); 
//        root.left.left = new Node(9); 
//        root.left.right = new Node(6); 
//        root.right.left = new Node(4); 
//        root.right.right = new Node(5); 
//        root.right.left.left = new Node(12); 
//        root.right.left.right = new Node(7); 
//        root.left.right.left = new Node(11); 
//        root.left.left.right = new Node(10); 
//        new DiagonalSum().diagonalSum(root);
		
//		RandomTree root = new RandomTree(1);
//		root.left = new RandomTree(2); 
//		root.right = new RandomTree(3); 
//		root.left.left = new RandomTree(4); 
//		root.left.right = new RandomTree(5); 
//		root.random = root.left.right; 
//		root.left.left.random = root; 
//		root.left.right.random = root.right;
//		new CloneRandomTree().cloneTree(root);
		
		
//		Node root = new Node(20);
//		root.left               = new Node(8); 		root.right              = new Node(22); 
//	    root.left.left         = new Node(4); 		root.left.right        = new Node(12); 
//	    root.left.right.left  = new Node(10); 		root.left.right.right = new Node(14);
	    
//	    BufferedReader reader = new BufferedReader(new FileReader("/Users/nitinbansal/TEST_FILES/file.txt"));
//	    FileWriter fw = new FileWriter("/Users/nitinbansal/TEST_FILES/file.txt");
	    
	}
}
