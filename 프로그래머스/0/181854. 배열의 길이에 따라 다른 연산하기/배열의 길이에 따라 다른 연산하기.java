import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for(int i = arr.length % 2 == 0 ? 1 : 0; i < answer.length; i += 2) {
            answer[i] = arr[i] + n;
        }
        
        return answer;
    }
}