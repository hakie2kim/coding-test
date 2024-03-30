class Solution {
    public int solution(int n) {
        // 	n (3진법) 변환
        StringBuilder nTreta = new StringBuilder(Integer.toString(n, 3));
        // 앞뒤 반전(3진법)
        nTreta.reverse();
        // 10진법으로 표현
        return Integer.parseInt(nTreta.toString(), 3);
    }
}