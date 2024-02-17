class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        char[] numToCharArr = String.valueOf(num).toCharArray();
        for (int i = 0; i < numToCharArr.length; i++) {
            if (numToCharArr[i] - '0' == k) {
                answer = i+1;
                break;
            }  
        }
        
        return answer;
    }
}