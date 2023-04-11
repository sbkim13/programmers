class Solution {
    public int[][] solution(int[] num_list, int n) {
        int col = num_list.length / n;
        int[][] answer = new int[col][n];
        int idx = 0;
        
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx++];
            }
        }
        
        return answer;
    }
}