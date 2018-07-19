package Solutions;

public class Solution_65 {
    public boolean isNumber(String s) {
        boolean point= false;
        boolean e= false;
        boolean n= false;
        char c;
        
        for (int i= 0; i< s.length(); i++){
            c= s.charAt(i);
            if (c== ' ') continue;
            if (c>= '0' && c<= '9') n= true;
            else if (c== '.'){
                if (point) return false;
                else if (i==0&& s.length()== 1) return false;
                else point= true;
            }
            else if (c== 'e'){
                if (e|| i== s.length()-1) return false;
                else{
                    if (i==0) return false;
                    else{
                        if (s.charAt(i-1)>= '0' && s.charAt(i-1)<= '9') point= true;
                        else return false;
                    }
                }
            }
            else return false;
        }
        return n;
    }
}
