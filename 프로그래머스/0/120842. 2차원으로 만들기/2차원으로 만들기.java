class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        // i:   01 23 45 67
        // i/n: 00 11 22 33
        // i%n: 01 01 01 01
        for (int i = 0; i < num_list.length; i++) {
            answer[i/n][i%n] = num_list[i];
        }
        
        return answer;
    }
}