package Solutions;

public class Solution_42 {
    public int trap(int[] height){
        int[] left= new int[height.length];
        int max= 0;
        for (int i= 0; i< height.length; i++){
            max= Math.max(height[i],max);
            left[i]= max;
        }

        int[] right= new int[height.length];
        max= 0;
        for (int i=height.length-1; i>= 0; i--){
            max= Math.max(height[i],max);
            left[i]= max;
        }

        int result= 0;
        for (int i= 0; i< height.length; i++){
            result= result+ Math.min(left[i], right[i])- height[i];
        }
        return result;
    }
}
