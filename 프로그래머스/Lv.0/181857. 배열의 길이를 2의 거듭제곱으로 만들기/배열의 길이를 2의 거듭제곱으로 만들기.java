class Solution {
    public int[] solution(int[] arr) {
        // arr의 길이가 2의 거듭제곱이 되도록하는 정답의 길이
        int answerLength = 1;
        while (answerLength < arr.length) {
            answerLength *= 2;
        }
        
        int[] answer = new int[answerLength]; // 배열 언 요소의 기본값은 0
        System.arraycopy(arr, 0, answer, 0, arr.length);
        
        return answer;
    }
}