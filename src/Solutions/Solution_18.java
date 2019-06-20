package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();
        for (int start = 0; start < nums.length -3; start++){
            for (int i= start + 2; i<nums.length -1; i++){
                int left= start+1;
                int right= nums.length -1;
                while (left< i && right> i){
                    int temp= nums[start]+nums[left]+ nums[right]+ nums[i];
                    if (temp> target) {right--;}
                    else if (temp< target) {left++;}
                    else{
                        ArrayList<Integer> ad= new ArrayList<>(Arrays.asList(nums[start],nums[left],nums[i],nums[right]));
                        result.add(ad);
                        right--;
                        left++;
                    }
                }
            }
        }
        List<List<Integer>> re= result.stream().distinct().collect(Collectors.toList());
        return re;
    }
}
