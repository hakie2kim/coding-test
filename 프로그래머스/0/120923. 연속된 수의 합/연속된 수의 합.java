class Solution {
    public int[] solution(int num, int total) {
        int[] result = new int[num];
        
        // num = 5
        // 예) 5 * n + 0 + 1 + 2 + 3 + 4 = total
        
        // 위 예의 상수항의 합
        int constant = 0;
        for (int i = 0; i < num; i++) {
            constant += i;
        }
        
        // (합 - 상수항) / num
        int n = (total - constant) / num;
        for (int i = 0; i < result.length; i++) {
            result[i] = n + i;
        }
        
        return result;
    }
}