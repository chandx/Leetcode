package Solutions;

import java.util.Arrays;

public class Solution_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+ nums[nums.length -1]+ nums[1];
        for (int i = 1; i<nums.length -1; i++){
            int left= 0;
            int right= nums.length -1;
            while (left< i && right> i){
                int temp= nums[left]+ nums[right]+ nums[i];
                if (temp> target) {
                    result= (Math.abs(result- target)< Math.abs(temp- target))? result: temp;
                    right--;
                }
                else if (temp< target) {
                    result= (Math.abs(result- target)< Math.abs(temp- target))? result: temp;
                    left++;
                }
                else return target;
            }
        }
        return result;
    }
}
