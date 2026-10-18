import java.util.*;
public class ValidAnagram {
    
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
          if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),s.charAt(i)+1);
          }else{
            map.put(s.charAt(i),1);
          }
        }
        for(int i=0;i<t.length();i++){
            char x=t.charAt(i);
            if(!map.containsKey(x) || map.get(x)==0){
                return false;
            }
            map.put(x,map.get(x)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        // Test inputs
        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";

        // Execute and print results
        System.out.println("Is anagram (s1, t1): " + isAnagram(s1, t1)); // Expected: true
        System.out.println("Is anagram (s2, t2): " + isAnagram(s2, t2)); // Expected: false
    }
}
