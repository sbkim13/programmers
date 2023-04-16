import java.util.*;

class Solution {
    public int[] solution(int n) {
        int i = 2;
        Set<Integer> set = new LinkedHashSet<Integer>();
        
        while(i <= Math.sqrt(n)) {
            if(n % i == 0) {
                n /= i;
                set.add(i);
            }
            else {
                i++;
            }
        }
        
        if(n > 1) {
            set.add(n);
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray();
        
    }
}