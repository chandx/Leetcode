package Solutions;

import java.util.HashMap;

public class Solution_771 {
    public int numJewelsInStones(String J, String S) {
        int sum= 0;
        HashMap<Character, Integer> map= new HashMap<>();

        for (char a: J.toCharArray()) map.put(a, 0);
        for (char b: S.toCharArray()){
            if (map.containsKey(b)) map.put(b, map.get(b)+1);
        }
        for (char c: map.keySet()) sum= sum+ map.get(c);
        return sum;
    }
}
