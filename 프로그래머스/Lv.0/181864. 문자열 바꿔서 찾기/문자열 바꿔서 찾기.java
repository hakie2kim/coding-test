class Solution {
    public int solution(String myString, String pat) {
        char[] myStrCharArr = myString.toCharArray();
        
        for (int i = 0; i < myStrCharArr.length; i++) {
            if (myStrCharArr[i] == 'A') {
                myStrCharArr[i] += 1;
                continue;
            }
                
            if (myStrCharArr[i] == 'B') {
                myStrCharArr[i] -= 1;     
                continue;
            }           
        }
        
        
        // myStrCharArr.toString()은 그냥 출력만 해주는 용도
        return new String(myStrCharArr).contains(pat) ? 1 : 0;
    }
}