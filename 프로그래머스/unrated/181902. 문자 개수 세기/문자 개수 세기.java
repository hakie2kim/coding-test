class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        // A-Z는 65부터 90, a-z는 97부터 122
        for (char letter : my_string.toCharArray()) {
            if (65 <= (int) letter && (int) letter <= 90) // 대문자인 경우
                answer[letter - 65]++;
            
            if (97 <= (int) letter && (int) letter <= 122) // 소문자인 경우
                answer[letter - 97 + 26]++; // 26은 소문자 배열 시작점           
        }
        
        return answer;
    }
}