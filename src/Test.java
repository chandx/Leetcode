import Solutions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        int[] nums= new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Solution_53 bench= new Solution_53();
        System.out.println(bench.maxSubArray(nums));
    }
}