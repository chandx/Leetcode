import Solutions.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        int[] nums= new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Solution_53 bench= new Solution_53();
        System.out.println(bench.maxSubArray(nums));
        String st= "sadfasdfe";
        st.concat();

        ConcurrentHashMap

    }

    public String removeDuplicates(String S) {
        Stack<Character> st =new Stack<>();
        boolean trigger= false;
        for(char c: S.toCharArray()){
            if(st.isEmpty()) {
                st.push(c);
                trigger= false;
            }
            else{
                if(c== st.peek()){
                    trigger= true;
                }
                else{
                    if(trigger) st.pop();
                    trigger= false;
                    st.push(c);
                }
            }
        }
        StringBuilder sb= new StringBuilder();
        whlie(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        return sb.toString();
    }d

    public static int fillTheTruck(int num, int[] boxes, int unitSize, int[] unitsPerBox,  int truckSize) {
        // WRITE YOUR BRILLIANT CODE HERE
        int boxTotal= 0;
        int units= 0;
        TreeMap<Integer, Integer> tMap= new TreeMap<>(Collections.reverseOrder());
        for(int i= 0; i< boxes.length; i++){
            tMap.put(unitsPerBox[i], boxes[i]);
        }
        while(tMap.size()>0 && boxTotal< truckSize){
            Map.Entry<Integer, Integer> c= tMap.pollFirstEntry();
            if(boxTotal+c.getValue()>= truckSize){
                return units+(truckSize-boxTotal)*c.getKey();
            }
            else{
                boxTotal= boxTotal+ c.getValue();
                units= units+(c.getKey()*c.getValue());
            }
        }
        return units;
    }
}