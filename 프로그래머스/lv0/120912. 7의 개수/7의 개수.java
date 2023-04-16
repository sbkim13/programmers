class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            String str = String.valueOf(array[i]);
            for(char ch : str.toCharArray()) {
                if(ch - '0' == 7) {
                    answer++;
                }
            }
        }
        return answer;
    }
}