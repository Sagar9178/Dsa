// 1004. Max Consecutive Ones III

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
// Example 2:

// Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
// Output: 10
// Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


class MaxOccuranceOFOne{
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0,1,0,0,0,1,1,1};

        int count_zero=0;
        int k=3;
        int left=0;
        int right;
        int ans=0;
        for(right=0;right<arr.length;right++){
            if(arr[right]==0){
                count_zero++;
            }
           while(count_zero>k){
                if(arr[left]==0){
                    count_zero--;
                }
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        System.err.println(ans);
        
    }
}