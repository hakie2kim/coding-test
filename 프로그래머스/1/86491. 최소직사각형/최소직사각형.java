class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 명함을 가로 최대 세로 최소가 되도록 눕히기
        for (int i = 0; i < sizes.length; i++) {
            int width = sizes[i][0];
            int height = sizes[i][1];
            
            if (width < height) {
                sizes[i][0] = height;
                sizes[i][1] = width;
            } 
        }
        
        // 가로 최대 세로 최대 구하기
        int maxWidth = sizes[0][0];
        int maxHeight = sizes[0][1];
        for (int i = 1; i < sizes.length; i++) {
            maxWidth = Math.max(maxWidth, sizes[i][0]);
            maxHeight = Math.max(maxHeight, sizes[i][1]);
        }
        
        return maxWidth * maxHeight;
    }
}