class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int num = i; num <= j; num++) {
            // 11과 같은 경우 숫자 하나에 k가 여러 개 있음
            for (char digit : (num + "").toCharArray()) 
                if (digit - '0' == k)
                    answer++;
        }
        
        return answer;
    }
}