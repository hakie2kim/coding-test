class Solution {
    public boolean solution(int x) {
        // 1. 각 자리 수 배열 구하기
        char[] xArr = (x+"").toCharArray();
        
        // 2. 각 자리 수의 합 구하기
        int totalDigits = 0;
        for (char xLett : xArr) {
            totalDigits += xLett - '0'; // char -> int
        }
        
        // 3. 하샤드 수인지 판단
        return (x % totalDigits == 0) ? true : false; 
    }
}