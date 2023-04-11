class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(; i <= j; i++) {
            String str = String.valueOf(i);
            for(char ch : str.toCharArray()) {
                if(ch - '0' == k) answer++;
            }
        }
        return answer;
    }
}