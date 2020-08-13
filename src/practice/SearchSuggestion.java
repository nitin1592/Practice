package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchSuggestion {
	List<List<String>> result = new ArrayList<>();
    
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<String> list = new ArrayList<String>();
        
        for (String product : products)
            list.add(product);
        
        for (int i=0; i<searchWord.length(); i++) {
            char ch = searchWord.charAt(i);
            int index = 0;
            
            while (index < list.size()) {
                if (list.get(index).charAt(i) != ch)
                    list.remove(index);
                else
                    index++;
            }
            
            Collections.sort(list);
            if (list.size() > 3)
                result.add(new ArrayList(list.subList(0, 3)));
            else
                result.add(new ArrayList<String>(list));
        }
        return result;
    }
}
