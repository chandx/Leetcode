package Solutions;

public class Solution_28 {
    public int strStr(String haystack, String needle) {
        if (needle== null|| needle.length()==0) return 0;
        char sc= needle.charAt(0);
        for (int i=0; i< haystack.length()- needle.length(); i++){
            if (haystack.charAt(i)== sc){
                String temp= haystack.substring(i, i+ needle.length());
                if (temp.equals(needle)) return i;
            }
        }
        return -1;
    }
}
