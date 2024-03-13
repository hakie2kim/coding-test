class Solution {
    public int[] solution(long n) {
        String strN = n + "";
        int strNLen = strN.length();
        int[] answer = new int[strNLen];
        
        char[] charArrN = strN.toCharArray();
        for (int i = 0; i < strNLen; i++) { 
            // charArrN[strN의 마지막 인덱스부터]
            // -'0'은char를 정수로 변환
            answer[i] = charArrN[strNLen - i - 1] - '0';
        }
        
        return answer;
    }
}