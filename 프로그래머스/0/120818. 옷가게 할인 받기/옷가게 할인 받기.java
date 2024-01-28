class Solution {
    public int solution(int price) {
        double discRate = 0;
        
        if (price >= 500000) {
            discRate = 0.2; 
        } else if (price >= 300000) {
            discRate = 0.1; 
        } else if (price >= 100000) {
            discRate = 0.05;
        }
        
        return (int) ((1.0 - discRate) * price);
    }
}