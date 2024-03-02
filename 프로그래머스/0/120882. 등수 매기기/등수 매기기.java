class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length]; // 점수 배열의 크기와 같은 순위 배열
        
        for (int i = 0; i < score.length; i++) {
            int rank = 1; // 순위 시작
            for (int j = 0; j < score.length; j++) {
                if (score[i][0] + score[i][1] < score[j][0] + score[j][1]) // 나의 점수가 다른 이의 점수보다 크면 순위가 밀려남
                    rank++;
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}