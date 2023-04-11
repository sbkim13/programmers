import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strArr = my_string.split("");
        List<String> list = new ArrayList<String>();
        
        for(String str : strArr) {
            if(list.contains(str)) continue;
            else {
                list.add(str);
                answer += str;
            }
        }
        
        return answer;
    }
}