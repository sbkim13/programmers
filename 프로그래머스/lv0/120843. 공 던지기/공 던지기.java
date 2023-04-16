class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 2 * (k - 1);
        
        return numbers[idx % numbers.length];
    }
}