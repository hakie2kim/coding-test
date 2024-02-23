class Solution {
    public int solution(int[][] dots) {
        // 직사각형의 x 좌표 값은 두 값 중 하나임
        // 직사각형의 y 좌표 값은 두 값 중 하나임
        // => x 값 중 다른 값이면 두 x 좌표의 차는 너비 w
        // => y 값 중 다른 값이면 두 y 좌표의 차는 높이 h
        
        int w = 0;
        int h = 0;
        int x = dots[0][0]; 
        int y = dots[0][1]; 
        
        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0])
                w = Math.abs(x - dots[i][0]);
                
            if (y != dots[i][1])
                h = Math.abs(y - dots[i][1]);
        }
        
        return w * h;
    }
}