import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
//         int[] answer = new int[score.length]; // 점수 배열의 크기와 같은 순위 배열
        
//         for (int i = 0; i < score.length; i++) {
//             int rank = 1; // 순위 시작
//             for (int j = 0; j < score.length; j++) {
//                 if (score[i][0] + score[i][1] < score[j][0] + score[j][1]) // 나의 점수가 다른 이의 점수보다 크면 순위가 밀려남
//                     rank++;
//             }
//             answer[i] = rank;
//         }
        
//         return answer;
        
        List<Integer> totalScores = new ArrayList<>();
        
        for (int[] engMathScore : score) {
            totalScores.add(engMathScore[0] + engMathScore[1]);
        }
        
        Collections.sort(totalScores, Collections.reverseOrder()); // 점수의 합이 높은 순으로 배열
        
        int[] answer = new int[score.length]; // 점수 배열의 크기와 같은 순위 배열
        for (int i = 0; i < answer.length; i++) {
            // indexOf를 사용하면 점수의 합이 같은 경우 어차피 더 작은 인덱스를 찾음        
            answer[i] = totalScores.indexOf(score[i][0] + score[i][1]) + 1; // +1은 인덱스가 0부터 시작하기 때문
        }
        
        return answer;
    }
}