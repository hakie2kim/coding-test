class Solution {
    public int solution(int n) {
        int answer = 2;
        
        for (int i = 1; i <= n; i++) {
            if ((int) Math.pow(i, 2) == n) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}