class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split("[^0-9]");
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].isBlank()) {
                sum += Integer.parseInt(arr[i]);
            }
        }
        
        System.out.print("git");
        
        return sum;
    }
}