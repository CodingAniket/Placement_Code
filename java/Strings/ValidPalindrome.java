package Strings;
public class ValidPalindrome {
    
    public static boolean isPalindrome(String s) {
       char arr[]=s.toCharArray();
       int left=0;
       int right=arr.length-1;
       while(left<right){
       if(!Character.isLetterOrDigit(arr[left])){
           left++;
       } else if(!Character.isLetterOrDigit(arr[right])){
           right--;
       }
       else{
        if(Character.toLowerCase(arr[left])!=Character.toLowerCase(arr[right])){
          return false;
        }
        left++;
       right--;
       }
       }
        
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println("Is Palindrome: " + result); // Expected: true
    }
}
