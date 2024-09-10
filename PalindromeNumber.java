// 9. Palindrome Number
// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // if(x>=0){
        //      String s=""+x;
        //     String[] arr=s.split("");
        //     s="";
        //     for(int i=arr.length-1;i>=0;i--){
        //     s=s+arr[i];
        // }
        //     return Long.parseLong(s)==x?true:false;
        // }else{
        //     return false;
        // }
        //or==================>
        int rev=0;
        int y=x;
        if(x>=0){
            while(x!=0){
                 int cu=x%10;
                 rev=rev*10+cu;
                 x=x/10;
            }
        return rev==y?true:false;
        }else{
            return false;
        }
        
       
    }
}
