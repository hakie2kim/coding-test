class Solution {
    public String solution(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1, 2); // 이진수 변환
        int num2 = Integer.parseInt(bin2, 2);
        
        return Integer.toBinaryString(num1 + num2);
    }
}