class Solution {
    public int solution(String myString, String pat) {
        String rep = "";
        for(String str : myString.split("")) {
            if(str.equals("A")) rep += "B";
            else rep += "A";
        }
        
        return rep.indexOf(pat) > -1 ? 1 : 0;
    }
}