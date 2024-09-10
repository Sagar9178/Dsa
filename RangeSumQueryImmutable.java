// 303. Range Sum Query - Immutable
// Given an integer array nums, handle multiple queries of the following type:

// Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
// Implement the NumArray class:

// NumArray(int[] nums) Initializes the object with the integer array nums.
// int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 

// Example 1:

// Input
// ["NumArray", "sumRange", "sumRange", "sumRange"]
// [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
// Output
// [null, 1, -1, -3]

// Explanation
// NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
// numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
// numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
// numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3

public class RangeSumQueryImmutable {
    int[] arr;
    int[] pre;
     public RangeSumQueryImmutable(int[] nums) {
         arr=nums;
         pre=new int[arr.length];
         for(int i=0;i<arr.length;i++){
         if(i==0){
             pre[i]=arr[i];
         }else{
             pre[i]=pre[i-1]+arr[i];
         }
     }
     }
     
     
     public int sumRange(int left, int right) {
         if(left==0){
             return pre[right];
         }else{
             return pre[right]-pre[left-1];
         }
        
     }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
