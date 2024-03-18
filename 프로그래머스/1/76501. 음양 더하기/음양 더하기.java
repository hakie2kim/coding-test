class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) // 실제 정수가 양수인 경우
                answer += absolutes[i];
            else // 실제 정수가 음수인 경우
                answer -= absolutes[i];
        }
        
        return answer;
    }
}