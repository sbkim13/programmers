class Solution {
    public int solution(int n) {
        int res = 1;
        for(int i = 1; i <= 10; i++) {
            if(n >= fact(i)) {
                res = i;
            }
            else {
                break;
            }
        }
        
        return res;
    }
    
    public int fact(int n) {
		if (n <= 1) return n;
		else return fact(n - 1) * n;
	}
}