class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0]++; // 짝수
            } else {
                answer[1]++; // 홀수
            }
        }
        
        return answer;
    }
}