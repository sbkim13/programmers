import java.util.*;

class Solution {
    public int solution(String s) {
        Stack st = new Stack();
        String[] strArr = s.split(" ");
        
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].compareTo("Z") != 0) {
                st.push(Integer.parseInt(strArr[i]));
            }
            else {
                st.pop();
            }
        }
        
        int sum = 0;
        while(!st.empty()) {
            sum += (int)st.pop();
        }
        
        return sum;
    }
}