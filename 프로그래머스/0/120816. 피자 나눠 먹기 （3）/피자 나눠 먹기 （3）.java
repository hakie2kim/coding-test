class Solution {
    public int solution(int slice, int n) {
        // 몫은 피자 몇 판인지, 그리고 나머지가 있으면 피자 한 판 더 추가
        return (n % slice == 0) ? n / slice : n / slice + 1;
    }
}

