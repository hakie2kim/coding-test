class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n != 0) { // n이 0이 아닐 때까지
            answer += n % 10; // 마지막 자리를 더함
            n /= 10; // 10으로 나누면 이미 더한 자리는 없어진 것으로 간주
        }
        
        return answer;
    }
}