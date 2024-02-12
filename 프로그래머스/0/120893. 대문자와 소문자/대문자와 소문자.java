class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        char[] my_string_to_char_array = my_string.toCharArray();
        for (char letter : my_string.toCharArray()) {
            if ('A' <= letter && letter <= 'Z') // 대문자일 경우
                answer.append((char) (letter+32)); // 소문자로 변경
            else // 소문자일 경우
                answer.append((char) (letter-32)); // 대문자로 변경
        }
        
        return answer.toString();
    }
}