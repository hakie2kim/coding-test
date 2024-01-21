class Solution {
    public int solution(String[] order) {
        int[] menuPrice = new int[2];
        
        for (String menu : order) {
            if (menu.contains("latte")) {
                menuPrice[1]++;
            } else { // 라떼를 제외하면 모두 4500원임
                menuPrice[0]++;
            }
        }
        
        return menuPrice[0] * 4500 + menuPrice[1] * 5000;
    }
}