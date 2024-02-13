class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        int[] lowerCaseAlphaCnters = new int[26]; // 알파벳 소문자 개수
        
        // 'a' = 97
        for (char letter : s.toCharArray()) { // 각각의 알파벳의 개수를 계수 
            lowerCaseAlphaCnters[letter-97]++; 
        }
        
        for (int i=0; i < lowerCaseAlphaCnters.length; i++) {
            if (lowerCaseAlphaCnters[i] == 1) // 한 번만 등장 -> 정답에 추가
                answer.append((char) (i + 97));
        }
        
        return answer.toString();
    }
}