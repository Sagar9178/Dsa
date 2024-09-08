// 53. Maximum Subarray

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int cur_sum = 0, final_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cur_sum += nums[i];
            final_sum = Math.max(cur_sum, final_sum);

            if (cur_sum <= 0) {
                cur_sum = 0;
            }
        }
        return final_sum;
    }
}
