class Solution {
    public int solution(String A, String B) {
        String aShifted = A;
        
        for (int i = 0; i < A.length(); i++) {
            // i는 A를 오른쪽으로 민 횟수
            if ((aShifted).equals(B))
                return i;
            
            StringBuilder temp = new StringBuilder("");
            temp.append(aShifted.charAt(aShifted.length()-1)); // 마지막 글자는 첫번째 위치로 변경
            temp.append(aShifted.substring(0, aShifted.length() - 1)); // 그 외는 오른쪽으로 한 칸씩
            
            aShifted = temp.toString();         
        }
        
        return -1;
    }
}