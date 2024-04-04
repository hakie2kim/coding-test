class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (char letter : s.toCharArray()) {
            if (letter != ' ') { // 공백이 아닌 경우
                if (Character.isUpperCase(letter)) {
                    // 대문자 시작 + (시작과 차이 + n만큼 밈) % 알파벳 크기
                    letter = (char) ('A' + (letter - 'A' + n) % 26);
                } else {
                    letter = (char) ('a' + (letter - 'a' + n) % 26);
                }
            }
            
            answer.append(letter);
        }
        
        return answer.toString();
    }
}