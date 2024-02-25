class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) { // 모든 지역에 대해
                answer += checkExplosion(i, j, board);
            }
        }
        
        return answer;
    }
    
    private int checkExplosion(int currX, int currY, int[][] board) {
        int[] arndXs = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] arndYs = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        
        int checkX;
        int checkY;
        
        for (int i = 0; i < arndXs.length; i++) { // 현재 위치에 대해 모든 위, 아래, 좌, 우, 대각선을 확인
            checkX = currX + arndXs[i];
            checkY = currY + arndYs[i];
            
            if (0 <= checkX && checkX < board.length && 0 <= checkY && checkY < board.length) { // 체크하는 범위가 board 안일 경우
                if (board[checkX][checkY] == 1) // 주변에 폭탄이 있으면
                    return 0;
            }
        }
        
        return 1;
    }
}