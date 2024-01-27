class Solution {
    public int[] solution(int n) {
        int size = (n % 2 == 1) ? n / 2 + 1 : n / 2;
        // 입출력 예시의 2번째 경우 (짝수 이하) : 1번째 경우 (홀수 이하)
        
        int[] answer = new int[size];
        
        for (int i = 0; i < size; i++) {
            answer[i] = 2 * i + 1;
        }
        
        return answer;
        
        // return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}