class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 2 * (k - 1);
        
        if(idx > numbers.length) {
            answer = numbers[idx % numbers.length];
        }
        else {
            answer = numbers[idx];
        }
        
        return answer;
    }
}