import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        StringBuilder sb = new StringBuilder("");
        StringBuilder numSb = new StringBuilder("");
        String[] numArr = numbers.split("");
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        for(String str : numArr) {
            sb.append(str);
            if(map.containsKey(sb.toString())) {
                numSb.append(map.get(sb.toString()));
                sb = new StringBuilder("");
            }
        }
        
        return Long.parseLong(numSb.toString());
    }
}