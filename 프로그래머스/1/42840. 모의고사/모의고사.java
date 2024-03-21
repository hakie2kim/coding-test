import java.util.*;

class Solution {
    int[] answers;
    
    // 각 수포자가 찍는 방식
    int[] supoja1 = {1, 2, 3, 4, 5};
    int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    // 각 수포자의 총합 얻는 메서드
    private int getScore(int supoja) {
        int score = 0;
        int[] pattern = {};
        
        // 수포자의 패턴에 따라 점수 계산
        switch(supoja) {
            case 1:
                pattern = supoja1;
                break;
            case 2:
                pattern = supoja2;
                break;
            case 3:
                pattern = supoja3;
                break;                
        }
        
        for (int i = 0; i < answers.length; i++) {
            // 반복되는 패턴이므로 나머지 연산자 사용
            if (answers[i] == pattern[i%pattern.length])
                score++;
        }
        
        return score;
    }
    
    public List solution(int[] answers) {
        this.answers = answers;
        
        int[] scores = {getScore(1), getScore(2), getScore(3)};
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // 최대값이랑 일치하는 수포자 추가
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore)
                answer.add(i+1);
        }
        
        return answer;
    }
}