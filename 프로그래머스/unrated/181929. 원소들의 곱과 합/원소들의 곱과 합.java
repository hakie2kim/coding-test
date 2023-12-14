class Solution {
    public int solution(int[] num_list) {
        int totalSum = 0;
        int totalMultiply = 1;
        for (int num : num_list) {
            totalSum += num;
            totalMultiply *= num;
        }
        return totalMultiply < totalSum * totalSum ? 1 : 0;
    }
}