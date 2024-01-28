class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        // num_list, answer
        // 4         0
        // 3         1
        // 2         2
        // 1         3
        // 0         4    
        
        for (int i = num_list.length - 1, j = 0; i >= 0 && j < num_list.length; i--, j++) {
            answer[j] = num_list[i];
        }
        
        return answer;
    }
}