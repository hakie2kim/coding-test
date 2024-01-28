class Solution {
    public int solution(int n) {
        // 몫은 피자 몇 판인지, 그리고 나머지가 있으면 피자 한 판 더 추가
        int leftPieciesToPan = (n % 7 != 0) ? 1 : 0;
        return n / 7 + leftPieciesToPan;
    }
}