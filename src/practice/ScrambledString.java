package practice;

import java.util.HashMap;

public class ScrambledString {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    HashMap<String, Integer> hm = new HashMap<>();
    public int isScramble(final String A, final String B) {
        int m =A.length();
        int n = B.length();
        
        if (m != n)
            return 0;
        if (A.equals(B))
            return 1;
        if (!anagrams(A, B))
            return 0;
            
        if (m <= 1)
            return 0;
        
        String key = A + "#" + B;
        if (hm.containsKey(key))
            return hm.get(key);
        
        int result = 0;
        for (int i=1;i<m; i++) {
            String s11 = A.substring(0, i);
            String s12 = A.substring(i);
            String s21 = B.substring(0, i);
            String s22 = B.substring(i);
            String s11New = A.substring(m-i);
            String s12New = A.substring(0, m-i);
            
            if ( (isScramble(s11, s21)==1 && isScramble(s12, s22)==1) || 
                    (isScramble(s11New, s21)==1 && isScramble(s12New, s22)==1) ){
                        result = 1;
                        break;
                    }
        }
        hm.put(key, result);
        return result;
    }
    
    public boolean anagrams(String s1, String s2) {
        char[]arr = new char[256];
        for (int i=0; i<s1.length(); i++) {
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }
        for (int i=0; i<256; i++) {
            if (arr[i] > 0)
                return false;
        }
        return true;
    }


}
