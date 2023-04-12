import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split("");
        Arrays.sort(strArr);
        Map<String, Integer> strMap = new LinkedHashMap<String, Integer>();
        List<String> strList = new ArrayList<String>();
        
        for(String str : strArr) {
            Integer cnt = strMap.get(str);
            strMap.put(str, cnt == null ? 1 : cnt + 1);
        }
        
        for(Map.Entry<String, Integer> e : strMap.entrySet()) {
        	if(e.getValue() == 1) {
        		strList.add(e.getKey());
        	}
        }
        
        return String.join("", strList);        
    }
}