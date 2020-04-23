package practice;

import java.util.ArrayList;

public class StringJustify {
    public ArrayList<String> fullJustify(ArrayList<String> A, int B) {
        ArrayList<String> result = new ArrayList<String>();
        int i = 0;
        int n = A.size();
        
        while (i < n) {
            int spaceCount = -1;
            int wordCount = 0;
            
            int start = i;
            
            while (i<n && (spaceCount+wordCount)<=B) {
                wordCount += A.get(i).length();
                spaceCount += 1;
                i++;
            }
            
            if (i==n && (spaceCount+wordCount)<=B ) {
                StringBuffer sb = new StringBuffer();
                int count = B;
                for (int j=start; j<i; j++) {
                    sb.append(A.get(j));
                    sb.append(" ");
                    count -= (A.get(j).length() + 1);
                }
                while (count-- > 0)
                    sb.append(" ");
                result.add(sb.toString());
                return result;
            }
            else {
                i--;
                wordCount -= A.get(i).length();
                spaceCount -= 1;
                int spaces = B-wordCount;
                int totalWords = i-start;
                int eachSpace = 0;
                int leftSpaces = 0;
                
                if (totalWords == 1) {
                    eachSpace = spaces;
                }
                else {
                    eachSpace = spaces/(totalWords-1);
                    leftSpaces = spaces - eachSpace*(totalWords-1);
                    // firstSpace = eachSpace + spaces%(totalWords-1);
                }
                
//                System.out.println("eachspace=" + eachSpace + "  leftspaces=" + leftSpaces);
                
                String str = "";
                // StringBuffer sb = new StringBuffer();
                // sb.append(A.get(start));
                
                
                for (int j=start; j<i-1; j++) {
                    str += A.get(j);
                    // sb.append(A.get(j));
                    for (int k=0; k<eachSpace; k++)
                        str += " ";
                        // sb.append(" ");
                    if(leftSpaces-- > 0)
                        str += " ";
                        // sb.append(" ");
                    
//                    System.out.println("length of string = " + str.length());
                }
                str += A.get(i-1);
                // sb.append(A.get(i-1));
                if (start==i-1 && str.length()<B) {
                	for (int k=0; k<eachSpace; k++)
                        str += " ";
                }
                
                result.add(str);
                // result.add(sb.toString());
            }
        }
        return result;
    }
}
