class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int size = brown + yellow;
        
        // 노란색 격자 위해 3부터 약수 구하기
        for (int n = 3; n <= Math.sqrt(size); n++) {
            int a = n;
            int b = size / a;
            
            // b가 정수이고 3 이상일 때
            if (size % a == 0 && b >= 3) {
                int width = Math.max(a, b);
                int height = Math.min(a, b);
                
                // 노란색 격자의 수 = 인자의 노란색 크기
                if ((width-2) * (height-2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
                
                
            }
        }
        
        return answer;
    }
}