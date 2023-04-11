import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int sub = Math.abs(array[0] - n);
        int answer = array[0];
        
        for(int i = 1; i < array.length; i++) {
            if(sub > Math.abs(array[i] - n)) {
                sub = Math.abs(array[i] - n);
                answer = array[i];
            }
        }
        
        return answer;
    }
}