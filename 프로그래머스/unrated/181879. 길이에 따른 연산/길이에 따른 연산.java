class Solution {
    public int solution(int[] num_list) {
        int num_list_length = num_list.length;
        int answer = num_list_length >= 11 ? 0 : 1;
        
        for (int num : num_list) {
            if (num_list_length >= 11) {
                answer += num;
            } else {
                answer *= num;
            }
        }
        
        return answer;
    }
}