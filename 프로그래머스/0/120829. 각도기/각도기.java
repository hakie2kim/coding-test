class Solution {
    public int solution(int angle) {
        int answer = 4; // 아래 조건이 모두 아닐 경우 평각
        
        if (angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle < 180) {
            answer = 3;
        }
        
        return answer;
    }
}