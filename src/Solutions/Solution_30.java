package Solutions;

import java.util.Hashtable;
import java.util.List;

public class Solution_30 {
    public List<Integer> findSubstring(String s, String[] words) {
        //TODO
        Hashtable<Character, String> dic= new Hashtable<>();
        for (String a: words){
            char temp= a.charAt(0);
            dic.put(temp, a);
        }

    }
}
