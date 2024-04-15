class Solution {
    public String[] solution(String my_string) {
        String[] splArr = my_string.split(" ");
        String tmp = "";
        for(String str : splArr) {
            if(!str.equals("")) tmp += str + " ";
        }
        String[] answer = tmp.split(" ");
        return answer;
    }
}