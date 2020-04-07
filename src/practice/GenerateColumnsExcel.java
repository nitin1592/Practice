package practice;

public class GenerateColumnsExcel {
	
	public void generateColumns() {
		StringBuffer sb = new StringBuffer("a");
		for (int i=0; i<1000; i++) {
			if (i%26 == 0)
				System.out.println();
			System.out.print(sb.toString() + " ");
			
			int index = sb.length()-1;
			
			while (index>=0 && sb.charAt(index)=='z') {
				sb.setCharAt(index, 'a');
				index--;
			}
			if (index == -1) {
				sb.insert(0, 'a');
			}
			else {
				char ch = sb.charAt(index);
				ch += 1;
				sb.setCharAt(index, ch);
			}
		}
	}

}
