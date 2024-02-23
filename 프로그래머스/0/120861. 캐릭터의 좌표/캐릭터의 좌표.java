class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        int xMax = (board[0]-1) / 2;
        int yMax = (board[1]-1) / 2;
        
        for (String key : keyinput) {
            switch(key) {
                case "up":
                    if (answer[1] >= yMax)
                        break;
                    answer[1]++;
                    break;
                case "down":
                    if (answer[1] <= yMax * -1)
                        break;                                       
                    answer[1]--;
                    break; 
                case "left":
                    if (answer[0] <= xMax * -1)
                        break;                     
                    answer[0]--;
                    break;
                case "right":
                    if (answer[0] >= xMax)
                        break;                    
                    answer[0]++;
                    break;                       
            }
        }

        return answer;
    }
}