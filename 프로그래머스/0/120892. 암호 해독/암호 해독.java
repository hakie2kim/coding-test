class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        
        char[] cipherToCharArray = cipher.toCharArray();
        for (int i=code-1; i < cipherToCharArray.length; i+=code) { // code번째 글가 해독된 암호 문자열
            answer.append(cipherToCharArray[i]);
        }
        
        return answer.toString();
    }
}