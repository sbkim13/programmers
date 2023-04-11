import java.util.*;

class Solution {
    public int solution(int num, int k) {
        String strNum = Integer.toString(num);
        int idx = strNum.indexOf(Integer.toString(k));
       
        return idx > -1 ? idx + 1 : idx;
    }
}