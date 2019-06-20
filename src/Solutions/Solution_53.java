package Solutions;
//Maxmium Sub Array
//Kadane's algorithm
public class Solution_53 {
    public int maxSubArray(int[] nums) {
        int maxsum= nums[0];
        int subsum= nums[0];
        for (int i= 1; i< nums.length; i++){
            subsum= Math.max(nums[i], subsum+ nums[i]);
            maxsum= Math.max(subsum, maxsum);
        }
        return maxsum;
    }
}
