import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] copyArr = Arrays.copyOf(emergency, len);
        int[] answer = new int[len];
        Arrays.sort(copyArr);
        
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(emergency[i] == copyArr[j]) {
                    answer[i] = len - j;
                }
            }
        }
        
        return answer;
    }
}