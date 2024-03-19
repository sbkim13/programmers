class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        int answer = len >= 11 ? 0 : 1;
        
        for(int i = 0; i < len; i++) {
            if(len >= 11) {
                answer += num_list[i];
            }
            else {
                answer *= num_list[i];
            }
        }
        return answer;
    }
}