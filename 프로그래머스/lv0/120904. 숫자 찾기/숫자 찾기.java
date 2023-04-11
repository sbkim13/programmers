import java.util.*;

class Solution {
    public int solution(int num, int k) {
        String strNum = Integer.toString(num);
        String[] arr = strNum.split("");
        int res = -1;
        
        for(int i = 0; i < arr.length; i++) {
        	int tmp = Integer.parseInt(arr[i]);
        	if(tmp == k) {
        		res = i + 1;
        		break;
        	}
        }
        
        System.out.print("연동test");
        
        return res;
    }
}