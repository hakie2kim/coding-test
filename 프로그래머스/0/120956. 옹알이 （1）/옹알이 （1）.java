class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] pronunciations = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            for (String pronunciation : pronunciations) {
                babbling[i] = babbling[i].replace(pronunciation, " ");
            }
            
            // babbling에서 가능한 발음이 모두 공백으로 대체 -> trim한 경우 -> 길이는 0
            if (babbling[i].trim().length() == 0)
                answer++;
        }
        
        return answer;
    }
}