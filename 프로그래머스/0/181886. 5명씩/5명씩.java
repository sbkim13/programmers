class Solution {
    public String[] solution(String[] names) {
        int len = names.length % 5 != 0 ? names.length / 5 + 1 : names.length / 5;
        String[] answer = new String[len];
        
        answer[0] = names[0];
        
        for(int i = 1; i < answer.length; i++) {
            answer[i] = names[5 * i];
        }
        return answer;
    }
}