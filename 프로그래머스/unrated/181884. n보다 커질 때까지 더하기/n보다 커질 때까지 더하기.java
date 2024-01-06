class Solution {
    public int solution(int[] numbers, int n) {
        int totalSum = 0;
        
        for (int number : numbers) {
            if (totalSum > n)
                break;
            
            totalSum += number;
        }
        
        return totalSum;
    }
}