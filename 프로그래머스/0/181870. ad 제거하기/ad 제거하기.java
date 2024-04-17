class Solution {
    public String[] solution(String[] strArr) {
        String tmp = "";
        
        for(String str : strArr) {
            if(!str.contains("ad")) {
                tmp += str + " ";
            }
        }
        return tmp.split(" ");
    }
}