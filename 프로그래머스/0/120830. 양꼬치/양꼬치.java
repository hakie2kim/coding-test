class Solution {
    public int solution(int n, int k) {
        return n * 12000 + (k - n / 10) * 2000; // 서비스로 받은 음료수의 개수를 빼고 계산
    }
}