class Solution {
    public int solution(int n) {
        // 남기지 않고 모두 같은 수의 피자 조각을 먹어야 함 -> 총 피자 조각을 사람 수로 나눴을 때 0
        int pan = 1;
        
        while (6 * pan % n != 0) {
            pan++;    
        }
        
        return pan;
    }
}