package Solutions;

public class Solution_27 {
    public int removeElement(int[] nums, int val) {
        if (nums== null||nums.length==0) return 0;
        int re=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!= val) {
                nums[re]= nums[i];
                re++;
            }
        }
        return re;
    }
}
