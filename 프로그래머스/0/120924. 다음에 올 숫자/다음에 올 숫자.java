class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        if (common[1] - common[0] == common[2] - common[1]) { // 등차수열인 경우
            int d = common[1] - common[0]; // 공차
            answer = common[common.length-1] + d;
        } else { // 등비수열인 경우
            int r = common[1] / common[0]; // 공비
            answer = common[common.length-1] * r;
        }
        
        return answer;
    }
}