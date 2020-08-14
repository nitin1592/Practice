package geekTrustFamily;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		FamilyTree tree = new FamilyTree();
		tree.initialiseFamilyTree();
		
		File file = new File("C:\\Users\\nitin.LAPTOP-31271V68\\Desktop\\GIT_workspace\\Practice\\src\\geekTrustFamily\\input.txt");
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] arr = sc.nextLine().split(" ");
				
				switch (arr[0]) {
				
				case "ADD_CHILD" :
					tree.addChild(arr[1], arr[2], arr[3]);
					break;
				
				case "GET_RELATIONSHIP" :
					tree.getRelation(arr[1], arr[2]);
					break;
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}