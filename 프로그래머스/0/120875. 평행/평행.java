class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int x1 = dots[0][0]; 
        int y1 = dots[0][1]; 
        
        int x2 = dots[1][0]; 
        int y2 = dots[1][1]; 
        
        int x3 = dots[2][0]; 
        int y3 = dots[2][1]; 
        
        int x4 = dots[3][0]; 
        int y4 = dots[3][1]; 
        
        // 01번째, 23번째 점을 이은 기울기가 일치할 경우
        if (slope(x1, y1, x2, y2) == slope(x3, y3, x4, y4))
            return 1;
        
        // 02번째, 13번째 점을 이은 기울기가 일치할 경우
        if (slope(x1, y1, x3, y3) == slope(x2, y2, x4, y4))
            return 1;
        
        // 03번째, 12번째 점을 이은 기울기가 일치할 경우
        if (slope(x1, y1, x4, y4) == slope(x2, y2, x3, y3))
            return 1;        
        
        return 0;
    }
    
    private static double slope(int x1, int y1, int x2, int y2) {
        return (double) (y2 - y1) / (x2 - x1);
    }
}