class Solution {
    public String solution(String myString, String pat) {
        // 입출력 예 # 1
        // myString.lastIndexOf(pat) = 3
        // pat.length() = 2
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}