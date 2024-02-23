class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        int xRightMax = (board[0]-1) / 2;
        int yUpMax = (board[1]-1) / 2;
        
        for (String key : keyinput) {
            switch(key) {
                case "up":
                    if (answer[1] >= yUpMax) // board의 세로 크기 벗어난 경우
                        break;
                    answer[1]++;
                    break;
                case "down":
                    if (answer[1] <= yUpMax * -1) // board의 세로 크기 벗어난 경우
                        break;                                       
                    answer[1]--;
                    break; 
                case "left":
                    if (answer[0] <= xRightMax * -1) // board의 가로 크기 벗어난 경우
                        break;                     
                    answer[0]--;
                    break;
                case "right":
                    if (answer[0] >= xRightMax) // board의 가로 크기 벗어난 경우
                        break;                    
                    answer[0]++;
                    break;                       
            }
        }

        return answer;
    }
}
