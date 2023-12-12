class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int count = 2;
        
        if (a == b && b == c) {
            count = 3;
        } else if (a != b && b != c && c != a) {
            count = 1;
        }
        
        switch (count) {
            case 3:
                answer *= a * a * a + b * b * b + c * c * c;
            case 2:
                answer *= a * a + b * b + c * c;
            case 1:
                answer *= a + b + c;
        }
        
        return answer;
    }
}