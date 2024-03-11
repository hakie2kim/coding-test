class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) // 1부터 n까지 나머지가 0인 경우 -> n의 약수
                answer += i;
        }
        
        return answer;
    }
}