class Solution {
    public int solution(int chicken) { // 주문하는 치킨의 개수
        int service = 0;

        while (chicken >= 10) {
            service += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        }
        return service;
    }
}