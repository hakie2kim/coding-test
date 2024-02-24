class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > answer) // 모든 곱에 대해서 기존 최댓값보다 크면 해당 곱을 최대값으로 함
                    answer = numbers[i] * numbers[j];
            }
        }
        
        return answer;
    }
}