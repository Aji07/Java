import java.util.*;

public class Solution {
    
    public int value(char ch) {
        if(ch == 'I') {return 1;}
        if(ch == 'V') {return 5;}
        if(ch == 'X') {return 10;}
        if(ch == 'L') {return 50;}
        if(ch == 'C') {return 100;}
        if(ch == 'D') {return 500;}
        if(ch == 'M') {return 1000;}    
        return -1;
    }
    
    public static void main(String[] args) {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Romen Letter : ");
        String str = sc.next().toUpperCase();
        System.out.println(obj.roman_to_Integer(str));
    }

    private int roman_to_Integer(String s) {
        int total = 0;
        for(int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if(i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if(s1 >= s2)
                    total += s1;
                else
                    total -= s1;
            }
            else{
                total += s1;
            }
        }
        return total;
    }
}