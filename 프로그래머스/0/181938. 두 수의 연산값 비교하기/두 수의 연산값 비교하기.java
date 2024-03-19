class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int mulTwo = 2 * a * b;
        int convert = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        return convert >= mulTwo ? convert : mulTwo;
    }
}