class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        int i = 0;
        for (char letter : s.toCharArray()) {
            if (letter == ' ') { // 공백인 경우 단어의 구분이므로 인덱스 초기화
                i = 0;
                answer.append(letter);
            } else {
                if (i % 2 == 0)
                    answer.append(Character.toUpperCase(letter));
                else
                    answer.append(Character.toLowerCase(letter));
            
                i++;
            } 
        }
        
        return answer.toString();
    }
}