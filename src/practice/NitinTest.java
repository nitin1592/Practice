package practice;

import java.util.HashMap;
import java.util.Map;

public class NitinTest {
	
	public long CountWays(int N){
        // Write your code here
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                for (int k=1; k<=N; k++) {
                    int key = i + 2*j + k;
                    if (!hm.containsKey(key))
                        hm.put(key, 1);
                    else
                        hm.put(key, hm.get(key)+1);
                }
            }
        }
        long result = 0;
        for (Map.Entry<Integer, Integer> entry1 : hm.entrySet()) {
            for (Map.Entry<Integer, Integer> entry2 : hm.entrySet()) {
                if(entry1.getKey() % entry2.getKey() == 0)
                    result += (long)entry1.getValue() * (long)entry2.getValue();
            }
        }
        return result;
    }
}
