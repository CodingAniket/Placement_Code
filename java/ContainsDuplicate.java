import java.util.*;
public class ContainsDuplicate {
    
    public static boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i:nums){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        } else{
            map.put(i,1);
        } }
        for(int i:nums){
            if(map.get(i)>1){
              return true;
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        // Test inputs
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};

        // Execute and print results
        System.out.println("Contains duplicate (nums1): " + containsDuplicate(nums1)); // Expected: true
        System.out.println("Contains duplicate (nums2): " + containsDuplicate(nums2)); // Expected: false
    }
}
