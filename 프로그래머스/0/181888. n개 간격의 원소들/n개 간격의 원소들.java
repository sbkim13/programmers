class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        int[] answer = new int[len];
        
        answer[0] = num_list[0];
        for(int i = 1; i < answer.length; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}