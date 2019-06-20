package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        for (int i= 1; i<nums.length -1; i++){
            int left= 0;
            int right= nums.length -1;
            while (left< i && right> i){
                int temp= nums[left]+ nums[right]+ nums[i];
                if (temp> 0) {right--;}
                else if (temp< 0) {left++;}
                else{
                    ArrayList<Integer> ad= new ArrayList<>(Arrays.asList(nums[left],nums[i],nums[right]));
                    result.add(ad);
                    right--;
                    left++;
                }
            }
        }
        List<List<Integer>> re= result.stream().distinct().collect(Collectors.toList());
        return re;
    }
}
