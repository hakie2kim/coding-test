class Solution {
    public long solution(int price, int money, int count) {
        // 총 필요한 놀이기구의 이용 금액
        long totalEntranceFee = 0;
        
        for (int i = 1; i <= count; i++) {
            // N번째 이용할 때 놀이기구 이용료
            totalEntranceFee += price * i;
        }

        return totalEntranceFee - money > 0 ? totalEntranceFee - money : 0;
    }
}