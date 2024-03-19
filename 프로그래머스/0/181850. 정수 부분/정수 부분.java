class Solution {
    public int solution(double flo) {
        int answer = 0;
        String[] str = String.valueOf(flo).split("\\.");
        
        return Integer.parseInt(str[0]);
    }
}