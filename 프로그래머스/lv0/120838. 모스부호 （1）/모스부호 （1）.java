class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        // 97~122
        String[] strArr = letter.split(" ");
        
        for(String str : strArr) {
            for(int i = 0; i < morse.length; i++) {
                if(str.compareTo(morse[i]) == 0) {
                    char c = (char) (i + 97);
                    answer += c;
                    break;
                }
            }
        }
                
        return answer;
    }
}