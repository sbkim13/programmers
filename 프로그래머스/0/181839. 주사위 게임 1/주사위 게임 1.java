class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(isOdd(a) && isOdd(b)) {
            answer = (int) (Math.pow(a, 2) + Math.pow(b, 2));
        }
        else if((isOdd(a) && !isOdd(b)) || (!isOdd(a) && isOdd(b))) {
            answer = 2 * (a + b);
        }
        else {
            answer = Math.abs(a - b);
        }
        return answer;
    }
    
    private boolean isOdd(int num) {
        return num % 2 != 0 ? true : false;
    }
}