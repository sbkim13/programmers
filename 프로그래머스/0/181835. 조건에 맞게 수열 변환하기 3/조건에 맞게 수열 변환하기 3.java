class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        boolean isOdd = k % 2 != 0 ? true : false;
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = isOdd ? arr[i] * k : arr[i] + k;
        }
        return answer;
    }
}