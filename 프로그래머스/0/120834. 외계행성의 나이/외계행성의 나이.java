class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        
        // 'a'는 ascii로 97, '0'은 ascii로 48
        for (char letter : String.valueOf(age).toCharArray()) {
            answer.append((char) (letter + 49));
        }
        
        return answer.toString();
    }
}