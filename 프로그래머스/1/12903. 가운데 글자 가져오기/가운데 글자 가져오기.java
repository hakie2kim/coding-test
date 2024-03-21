class Solution {
    public String solution(String s) {
        String answer = "";
        int strLen = s.length();
        
        // 단어 s의 길이가
        // 짝수인 경우
        if (strLen % 2 == 0)
            answer = s.substring(strLen / 2 - 1, strLen / 2 + 1);
        // 홀수인 경우
        else
            answer = s.charAt(strLen / 2) + "";
        
        return answer;
    }
}