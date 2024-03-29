class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            String aftZeroRep = s.replace("0", "");
            
            int aftZeroRepLen = aftZeroRep.length();
            
            // 제거할 0의 개수
            answer[1] += s.length() - aftZeroRepLen;
            
            // 0 제거 후 문자열을 이진 변환
            s = Integer.toBinaryString(aftZeroRepLen);
            
            // 회차 증가
            answer[0] += 1;            
        }
        
        return answer;
    }
}