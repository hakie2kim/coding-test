class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int last = num_list[num_list.length - 1];
        int secondFromLast = num_list[num_list.length - 2];
        
        int adding = last > secondFromLast ? last - secondFromLast : last * 2;
        
        for (int i = 0; i < answer.length - 1; i++) {
            answer[i] = num_list[i];
        }
        answer[num_list.length] = adding;
        
        return answer;
    }
}