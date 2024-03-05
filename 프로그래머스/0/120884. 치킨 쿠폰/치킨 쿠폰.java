class Solution {
    public int solution(int chicken) { // 주문하는 치킨의 개수
        int service = 0; // 서비스 치킨의 개수

        while (chicken >= 10) {
            service += chicken / 10; // 받은 쿠폰으로 주문할 수 있는 서비스 치킨
            chicken = (chicken / 10) + (chicken % 10); // 주문한 후 치킨
        }
        return service;
    }
}
