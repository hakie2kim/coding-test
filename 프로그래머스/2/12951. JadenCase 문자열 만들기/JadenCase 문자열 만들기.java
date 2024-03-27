class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        s = s.toLowerCase();
        
        // 공백 다음 문자인지 확인
        boolean check = true;
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                check = true;
            } else if (check) {
            	// 대문자로 변경
                c = Character.toUpperCase(c);
                check = false;
            }
            
            sb.append(c);
        }
                
        return sb.toString();
    }
}