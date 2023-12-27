class Solution {
    public int solution(String number) {
        int totalDigitsSum = 0;
        
        for (char digit : number.toCharArray()) {
            totalDigitsSum += digit - '0'; // char - '0'은 int
        }
        
        return totalDigitsSum % 9;
    }
}