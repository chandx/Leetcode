package Solutions;

class Costum_Pair {
    public int _front;
    public int _rear;
    public Costum_Pair(int a, int b) {
        _front= a;
        _rear= b;
    }
}
public class Solution_5 {
    public Solution_5(){

    }
    public String longestPalindrome(String s) {
        int length= s.length();
        String result= "";
        boolean[][] dp= new boolean[length][length];
        for (int i = length - 1; i >= 0; i--) {
            for (int j = i; j < length; j++) {
                dp[i][j]= s.charAt(i)== s.charAt(j)&& (j-i<3|| dp[i+1][j-1]);
                if (dp[i][j] && (j - i + 1 > result.length())) {
                    result = s.substring(i,j+1);
                }
            }
        }
        return result;
        /*Costum_Pair[][] test_table= new Costum_Pair[length][length];
        //initialize the table
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                if (i==j) test_table[i][j] = new Costum_Pair(i, j);
                else test_table[i][j] = new Costum_Pair(-1, -1);
            }
        }
        //start the dp
        for (int i = 1; i < length; i++){   //end position
            for (int j = i -1; j >= 0; j--){    //start position
                Costum_Pair changeFromRight= test_table[i][j+1];
                Costum_Pair changeFromUp= test_table[i-1][j+1];
                Costum_Pair up= test_table[i-1][j];

                if (changeFromRight._front== j+1){
                    if (changeFromRight._rear+1< i&&
                            s.charAt(j)== s.charAt(changeFromRight._rear+1))
                        changeFromRight= new Costum_Pair(j, changeFromRight._rear+1);
                    else if (changeFromRight._front== changeFromRight._rear&&
                            s.charAt(j)== s.charAt(changeFromRight._rear))
                        changeFromRight= new Costum_Pair(j, changeFromRight._rear);
                }
                if (changeFromUp._front== j+1){
                    if (changeFromUp._rear+1<= i&&
                            s.charAt(j)== s.charAt(changeFromUp._rear+1))
                        changeFromUp= new Costum_Pair(j, changeFromUp._rear+1);
                    else if (changeFromUp._front== changeFromUp._rear&&
                            s.charAt(j)== s.charAt(changeFromUp._rear))
                        changeFromUp= new Costum_Pair(j, changeFromUp._rear);
                }


                test_table[i][j]= (changeFromUp._rear-changeFromUp._front> changeFromRight._rear- changeFromRight._front)? changeFromUp: changeFromRight;
                test_table[i][j]= (up._rear-up._front> test_table[i][j]._rear-test_table[i][j]._front)? up: test_table[i][j];
//                print_table(test_table, length);
            }
        }
        // test print
//        print_table(test_table, length);
        return s.substring(test_table[length-1][0]._front,test_table[length-1][0]._rear+1);*/
    }

    private void print_table(Costum_Pair[][] test_table, int length){
        for (int i = 0; i < length; i++){
            for (int j = 0; j <=i; j++){
                System.out.print(test_table[i][j]._front+ ","+ test_table[i][j]._rear+ "\t");
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }
}
