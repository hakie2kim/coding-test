class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for (char num_ : String.valueOf(order).toCharArray()) {
            int num = 0;
            if (num_-'0' == 3 || num_-'0' == 6 || num_-'0' == 9)
                answer++;
        }
        
        return answer;
    }
}