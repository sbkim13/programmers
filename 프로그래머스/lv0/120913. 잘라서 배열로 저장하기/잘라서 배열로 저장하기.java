import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<String>();
        int i = 0;
        
        while(n <= my_str.length()) {
            list.add(my_str.substring(0, n));
            my_str = my_str.substring(n);
        }
        if(my_str.compareTo("") != 0) {
            list.add(my_str);
        }
        
        return list.toArray(new String[0]);
    }
}