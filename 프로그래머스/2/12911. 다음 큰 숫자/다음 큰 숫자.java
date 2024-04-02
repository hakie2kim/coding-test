class Solution {
    // 이진수의 1 개수 구하기
    private int binOneCounter(String binary) {
        int answer = 0;
        
        for (char letter : binary.toCharArray()) {
            if (letter == '1')
                answer++;
        }
        
        return answer;
    }
    
    public int solution(int n) {
        int answer = 0;
        
        // n을 이진수로 변환
        String nToBinary = Integer.toBinaryString(n);
        
        while (true) {
            n++; // 다음 n에 대해
            
            int oneCnt = binOneCounter(nToBinary);
            // n의 1 개수가 다음 n의 1의 개수가 같다면
            if (oneCnt == binOneCounter(Integer.toBinaryString(n))) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}