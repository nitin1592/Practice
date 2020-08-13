package geekTrustFamily;

import java.util.ArrayList;

public class Node {
	String name;
	Node mother;
	Node spouse;
	boolean isMale;
	ArrayList<Object> children;
	public Node(String name, Node mother, Node spouse, boolean isMale) {
		this.name = name;
		this.mother = mother;
		this.spouse = spouse;
		this.isMale = isMale;
		this.children = new ArrayList<>();
	}
	
}