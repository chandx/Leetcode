package Solutions;

import java.util.LinkedList;
import java.util.List;

public class Solution_17 {
    public List<String> letterCombinations(String digits) {
        List<String> re= new LinkedList<String>();
        String[] nchar= new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int i= 0; i< digits.length(); i++){
            int t= Integer.valueOf(digits.charAt(i))- 48;
            if(t>9 || t< 0) return re;
            int a= re.size();
            String di= nchar[t];
            if(a== 0){
                for(int y= 0; y< di.length(); y++){
                    String v= ""+ di.charAt(y);
                    re.add(v);
                }
            }
            else{
                for(int x= 0; x< a; x++){
                    String g= re.remove(0);
                    for(int y= 0; y< di.length(); y++){
                        String v= g+ di.charAt(y);
                        re.add(v);
                    }
                }
            }
        }
        return re;
    }
}
