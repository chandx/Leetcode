package Solutions;

public class Solution_26 {
    public int removeDuplicates(int[] nums) {
        if (nums== null) return 0;
        if (nums.length<2) return nums.length;
        int re=1;
        for (int i=1; i<nums.length; i++){
            if (nums[i-1]!= nums[i]) {
                nums[re]= nums[i];
                re++;
            }
        }
        return re;
    }
}
