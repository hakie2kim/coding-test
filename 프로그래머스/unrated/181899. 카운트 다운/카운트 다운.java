class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        for (int num = start, j = 0; num >= end_num; num--, j++) {
            answer[j] = num;
        }
        return answer;
    }
}