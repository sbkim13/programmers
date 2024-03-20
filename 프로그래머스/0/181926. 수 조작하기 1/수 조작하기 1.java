class Solution {
    public int solution(int n, String control) {
        String[] strArr = control.split("");
        for(int i = 0; i < strArr.length; i++) {
            switch (strArr[i]) {
                case "w" : 
                    n += 1;
                    break;
                case "s" :
                    n -= 1;
                    break;
                case "d" : 
                    n += 10;
                    break;
                case "a" : 
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}