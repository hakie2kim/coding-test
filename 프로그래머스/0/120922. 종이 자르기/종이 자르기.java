class Solution {
    public int solution(int M, int N) {
        // (M을 크기 1로 만들기 위한 최소 자르기 횟수) + (가로가 1 세로 M인 직사각형의 개수) * (N을 크기 1로 만들기 위한 최소 자르기 횟수) 
        return (M-1) + M * (N-1);
    }
}