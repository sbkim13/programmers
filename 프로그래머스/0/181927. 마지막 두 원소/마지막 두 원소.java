class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        for(int i = 0; i < answer.length; i++) {
            if(i == num_list.length) {
                int numIndex = i - 1;
                answer[i] = num_list[numIndex] > num_list[numIndex - 1] ? num_list[numIndex] - num_list[numIndex - 1] : num_list[numIndex] * 2;
            }
            else {
                answer[i] = num_list[i];   
            }
        }
        return answer;
    }
}