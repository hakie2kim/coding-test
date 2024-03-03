class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for (String[] idAndPwd : db) {
            String id = idAndPwd[0];
            String pwd = idAndPwd[1];
            
            // 아이디 패스워드 모두 맞은 경우
            if (id.equals(id_pw[0]) && pwd.equals(id_pw[1])) {
                answer = "login";
                break;
            }
            
            // 아이디만 맞은 경우
            if (id.equals(id_pw[0]) && !pwd.equals(id_pw[1])) {
                answer = "wrong pw";
                break;
            }
            
            // 그 외는 실패
                
        }
        
        return answer;
    }
}