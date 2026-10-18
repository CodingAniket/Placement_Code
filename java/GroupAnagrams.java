import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;

public class GroupAnagrams {
    public static String AnagramSort(String s){
        char charArray[]=s.toCharArray();
        Arrays.sort(charArray);
        s=String.valueOf(charArray);
        return s;
    }
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String key=AnagramSort(strs[i]);
          if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
          } 
          map.get(key).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        // Test inputs
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Execute and print results
        List<List<String>> result = groupAnagrams(strs);
        System.out.println("Grouped Anagrams: " + result);
    }
}
