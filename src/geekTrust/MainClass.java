package geekTrust;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\nitin.LAPTOP-31271V68\\Desktop\\GIT_workspace\\Practice\\src\\geekTrust\\inputFile.txt");
		Scanner sc = new Scanner(file);
		
		HashMap<String, String> inputMap = new HashMap<>();
		
		while (sc.hasNextLine()) {
			String[] arr = sc.nextLine().split(" ");
			inputMap.put(arr[0], arr[1]);
		}
		
		System.out.println(inputMap.get("LAND"));
//		new KingdomRule().canRule(inputMap);
	}

}
