class Solution {
    public boolean solution(String s) {
        // 문자열 s의 길이가 4 혹은 6
        int sLen = s.length();
        if (sLen != 4 && sLen != 6)
            return false;
        
        // 숫자로만 구성돼있는지 확인
        for (char letter : s.toCharArray()) {
            if (Character.isAlphabetic(letter))
                return false;
        }
        
        return true;
    }
}