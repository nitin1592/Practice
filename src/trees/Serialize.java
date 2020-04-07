package trees;

import java.io.FileWriter;
import java.io.IOException;

public class Serialize {
	
	final int marker = -1;
	public void serializeTree (Node root, FileWriter fw) throws IOException {
		if (root==null) {
			fw.write(Integer.toString(marker));
			return;
		}
		fw.write(Integer.toString(root.data));
		serializeTree(root.left, fw);
		serializeTree(root.right, fw);
	}

}
