class Solution {
    public int solution(String myString, String pat) {
        int occurrence = 0;
        for (int i = 0; i <= myString.length() - pat.length(); i++) { // 처음부터 myString.length() - pat.length()까지
            if (myString.substring(i, i + pat.length()).equals(pat)) { // pat의 길이만큼 잘라낸 일부 문자열이 pat과 일치하면 등장 횟수를 1 증가
                occurrence++;
            }
        }
        
        return occurrence;
    }
}