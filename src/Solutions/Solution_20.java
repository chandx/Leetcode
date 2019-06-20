package Solutions;

import java.util.Stack;

public class Solution_20 {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for (int i= 0; i< s.length(); i++){
            char a= s.charAt(i);
            if (a==')'){
                if (st.isEmpty()){ return false; }
                if (st.pop()!='(') { return false; }
            }
            else if (a==']'){
                if (st.isEmpty()){ return false; }
                if (st.pop()!='[') { return false; }
            }
            else if (a=='}'){
                if (st.isEmpty()){ return false; }
                if (st.pop()!='{') { return false; }
            }
            else{
                st.push(a);
            }
        }
        return st.isEmpty();
    }
}
