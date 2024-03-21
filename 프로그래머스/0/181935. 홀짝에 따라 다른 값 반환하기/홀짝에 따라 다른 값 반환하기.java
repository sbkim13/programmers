class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean isOdd = n % 2 != 0 ? true : false;
        
        for(int i = n; i > 0; i -= 2) {
            if(isOdd) {
                answer += i;
            }
            else {
                answer += i * i;
            }
        }
        return answer;
    }
}