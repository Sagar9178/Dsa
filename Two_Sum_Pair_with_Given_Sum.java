// Given an array arr of positive integers and another number x. Determine whether two elements exist in arr whose sum is exactly x or not. Return a boolean value true if two elements exist in arr else return false.

// Examples:

// Input: x = 16, arr[] = [1, 4, 45, 6, 10, 8]
// Output: true
// Explanation: arr[3] + arr[4] = 6 + 10 = 16
// Input: x = 11, arr[] = [1, 2, 4, 3, 6]
// Output: false
// Explanation: None of the pair makes a sum of 11
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)

//create a new array of size 10^5+1 and check the req value of new array index value is present or not if not put 1 on current value


public class Two_Sum_Pair_with_Given_Sum {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // code here
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++ ){
        //         if(arr[i]+arr[j]==x){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        int[] check=new int[100001];
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int req=x-curr;
            if(req>0&&check[req]==1){
                return true;
            }else{
                check[curr]=1;
            }
        }
        return false;
    }
}
