class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] exp = quiz[i].split(" ");
            
            int left = Integer.parseInt(exp[0]);
            int right = Integer.parseInt(exp[2]);
            int result = 0; // 수식의 합 또는 차
            
            switch (exp[1]) {
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;                    
            }
            
            if (result == Integer.parseInt(exp[4])) { // 연산이 결과와 같다면
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
            
        return answer;
    }
}