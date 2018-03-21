package Solutions;

import java.util.Arrays;

public class Solution_34 {
    public Solution_34(){

    }
    public int[] searchRange(int[] nums, int target){
        int[] result= new int[]{-1, -1};
        if (nums.length== 0) return result;
        if (nums[0]<= target&& target<= nums[nums.length-1]){
            return recursiveSearch(nums, target, 0, nums.length-1);
        }
        return result;
    }
    private int[] recursiveSearch(int[] nums, int target, int start, int end){
        int[] result= new int[]{-1, -1};
        int mid= (start+ end)/ 2;
        //halt state
        if (start== mid){
            if (nums[start]== target) {
                result[0]= start;
                result[1]= start;
            }
            if (nums[end]== target){
                result[1]= end;
                if (result[0]== -1) result[0]= end;
            }
            System.out.println("Halt:\t"+ "Position:"+ Integer.toString(start)+ ","+ Integer.toString(end)+ "\t"+ "Value:"+ Arrays.toString(result));
        }
        //recursive Process
        else{
            if (target< nums[mid]){
                result= recursiveSearch(nums, target, start, mid);
                System.out.println("Recursive left:\t"+ "Position:"+ Integer.toString(start)+ ","+ Integer.toString(end)+ ","+ Integer.toString(mid)+ "\t"+ "Value:"+ Arrays.toString(result));
            }
            else if (nums[mid]< target){
                result= recursiveSearch(nums, target, mid, end);
                System.out.println("Recursive right:\t"+ "Position:"+ Integer.toString(start)+ ","+ Integer.toString(end)+ ","+ Integer.toString(mid)+ "\t"+ "Value:"+ Arrays.toString(result));
            }
            else{
                int[] left= recursiveSearch(nums, target, start, mid);
                int[] right= recursiveSearch(nums, target, mid, end);
                result[0]= left[0];
                result[1]= right[1];
                System.out.println("Recursive mid:\t"+ "Position:"+ Integer.toString(start)+ ","+ Integer.toString(end)+ ","+ Integer.toString(mid)+ "\t"+ "Value:"+ Arrays.toString(result));
            }
        }
        return result;
    }
}
